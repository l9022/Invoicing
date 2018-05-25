package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Merchandise;

public class MerchandiseDao extends HibernateDaoSupport implements IMerchandiseDao{

	@Override
	public List<Merchandise> findMerchandise(Merchandise merchandise) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Merchandise.class);
		if(null!=merchandise){
			if(null != merchandise.getId()){
				criteria.add(Restrictions.eq("id", merchandise.getId()));
			}
			if(null!=merchandise.getCode()&& merchandise.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", merchandise.getCode()));
			}
			if(null!=merchandise.getName()&& merchandise.getName().trim().length()>0){
				criteria.add(Restrictions.like("name", merchandise.getCode(),MatchMode.ANYWHERE));
			}
			
		}
		return (List<Merchandise>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void saveMerchandise(Merchandise merchandise) {
		getHibernateTemplate().save(merchandise);
	}

	@Override
	public List<Merchandise> findMerchandiseByCode(Merchandise merchandise) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Merchandise.class);
		if(null!=merchandise){
			if(null!=merchandise.getCode()&& merchandise.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", merchandise.getCode()));
			}
		}
		return (List<Merchandise>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void updateMerchandise(Merchandise merchandise) {
		Merchandise m = this.getHibernateTemplate().get(Merchandise.class, merchandise.getId());
		m.setCode(merchandise.getCode());
		m.setName(merchandise.getName());
		m.setPrice(merchandise.getPrice());
		this.getHibernateTemplate().update(m);
	}

	@Override
	public void delMerchandise(int merchandise) {
		Merchandise m = this.getHibernateTemplate().get(Merchandise.class, merchandise);
		this.getHibernateTemplate().delete(m);
	}

}
