package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Stockin;

public class StockinDao extends HibernateDaoSupport implements IStockinDao{
	private IMerchandiseDao merchandiseDao;
	private IClientDao clientDao;
	private IEmployeeDao employeeDao;

	public IMerchandiseDao getMerchandiseDao() {
		return merchandiseDao;
	}
	public void setMerchandiseDao(IMerchandiseDao merchandiseDao) {
		this.merchandiseDao = merchandiseDao;
	}
	public IClientDao getClientDao() {
		return clientDao;
	}
	public void setClientDao(IClientDao clientDao) {
		this.clientDao = clientDao;
	}
	public IEmployeeDao getEmployeeDao() {
		return employeeDao;
	}
	public void setEmployeeDao(IEmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
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
				if (null != stockin.getClient().getId()) {
					criteria.add(Restrictions.eq("client.id", stockin.getClient().getId()));
				}
			}
			if (null != stockin.getEmployee()) {
				if (null != stockin.getEmployee().getId()) {
					criteria.add(Restrictions.eq("employee.id", stockin.getEmployee().getId()));
				}
				
			}
			if (null != stockin.getStockindate() && stockin.getStockindate().trim().length() > 0) {
				criteria.add(Restrictions.eq("stockindate", stockin.getStockindate()));
			}
		}
		return (List<Stockin>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	
	@Override
	public void saveStockin(Stockin stockin) {
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
		s.setClient(clientDao.findClient(stockin.getClient()).get(0));
		s.setMerchandise(merchandiseDao.findMerchandise(stockin.getMerchandise()).get(0));
		s.setAmount(stockin.getAmount());
		s.setPrice(stockin.getPrice());
		s.setMoney(stockin.getMoney());
		s.setEmployee(employeeDao.findEmployee(stockin.getEmployee()).get(0));
		s.setStockindate(stockin.getStockindate());
		this.getHibernateTemplate().update(s);
	}
	@Override
	public void delStockin(int stockin) {
		this.getHibernateTemplate().
		    delete(this.getHibernateTemplate().get(Stockin.class, stockin));
	}

}
