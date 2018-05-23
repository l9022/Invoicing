package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Merchandise;
import domain.Stockin;

public class StockinDao extends HibernateDaoSupport implements IStockinDao{
	private MerchandiseDao merchandiseDao;
	
	public MerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}
	public void setMerchandiseDao(MerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}

	@Override
	public List<Stockin> findStockin(Stockin stockin) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Stockin.class);
		if (null != stockin) {
			if (null != stockin.getCode() && stockin.getCode().trim().length() > 0) {
				criteria.add(Restrictions.eq("code", stockin.getCode()));
			}
			if (null != stockin.getMerchandise()) {
				if (null != stockin.getMerchandise().getId()) {
					criteria.add(Restrictions.eq("merchandise.id", stockin.getMerchandise().getId()));
				}
			}
			if (null != stockin.getClient()) {
				if (null != stockin.getClient().getName() && stockin.getClient().getName().trim().length() > 0) {
					criteria.add(Restrictions.eq("client.name", stockin.getClient().getName()));
				}
			}
			if (null != stockin.getStockindate() && stockin.getStockindate().trim().length() > 0) {
				criteria.add(Restrictions.eq("stockindate", stockin.getStockindate()));
			}
			if (null != stockin.getEmployee()) {
				if (null != stockin.getEmployee().getName() && stockin.getEmployee().getName().trim().length() > 0) {
					criteria.add(Restrictions.eq("employee.name", stockin.getEmployee().getName()));
				}

			}
		}
		return (List<Stockin>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	
	@Override
	public void saveStockin(Stockin stockin) {
		Merchandise merchandise = new Merchandise();
		merchandise.setId(stockin.getMerchandise().getId());
		stockin.setMerchandise(merchandiseDao.findMerchandise(merchandise).get(0));
		this.getHibernateTemplate().save(stockin);
	}
	@Override
	public List<Stockin> findStockinByCode(Stockin stockin) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Stockin.class);
		if (null != stockin) {
			if (null != stockin.getCode() && stockin.getCode().trim().length() > 0) {
				criteria.add(Restrictions.eq("code", stockin.getCode()));
			}
		}
		return (List<Stockin>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	@Override
	public void updateStockin(Stockin stockin) {
		Stockin s = this.getHibernateTemplate().get(Stockin.class, stockin.getId());
		s.setCode(stockin.getCode());
		s.setClient(stockin.getClient());
		s.setMerchandise(stockin.getMerchandise());
		s.setAmount(stockin.getAmount());
		s.setPrice(stockin.getPrice());
		s.setMoney(stockin.getMoney());
		s.setEmployee(stockin.getEmployee());
		s.setStockindate(stockin.getStockindate());
		this.getHibernateTemplate().update(s);
	}

}
