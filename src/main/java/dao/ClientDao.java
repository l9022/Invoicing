package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Client;
import domain.Client;

public class ClientDao extends HibernateDaoSupport implements IClientDao{

	@Override
	public List<Client> findClient(Client client) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Client.class);
		if(null != client) {
			if(null != client.getId()){
				criteria.add(Restrictions.eq("id", client.getId()));
			}
			if(null != client.getCode() && client.getCode().trim().length()>0) {
				criteria.add(Restrictions.eq("code", client.getCode()));
			}
			if(null != client.getName() && client.getName().trim().length()>0) {
				criteria.add(Restrictions.like("name", client.getName(),MatchMode.ANYWHERE));
			}
		}
		return (List<Client>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void saveClient(Client client) {
		getHibernateTemplate().save(client);
	}

	@Override
	public List<Client> findClientByCode(Client client) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Client.class);
		if(null!=client){
			if(null!=client.getCode()&& client.getCode().trim().length()>0){
				criteria.add(Restrictions.eq("code", client.getCode()));
			}
		}
		return (List<Client>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void updateClient(Client client) {
		Client c = this.getHibernateTemplate().get(Client.class, client.getId());
		c.setCode(client.getCode());
		c.setName(client.getName());
		c.setAddress(client.getAddress());
		c.setTelephone(client.getTelephone());
		c.setEmail(client.getEmail());
		this.getHibernateTemplate().update(c);
	}

	@Override
	public void delClient(int client) {
		Client c = this.getHibernateTemplate().get(Client.class, client);
		this.getHibernateTemplate().delete(c);
	}
}
