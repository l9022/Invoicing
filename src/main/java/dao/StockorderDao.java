package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Stockin;
import domain.Stockorder;

public class StockorderDao extends HibernateDaoSupport implements IStockorderDao{
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
	public List<Stockorder> findStockorder(Stockorder stockorder) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Stockorder.class);
		if (null != stockorder) {
			if (null != stockorder.getCode() && stockorder.getCode().trim().length() > 0) {
				criteria.add(Restrictions.eq("code", stockorder.getCode()));
			}
			if (null != stockorder.getMerchandise()) {
				if (null != stockorder.getMerchandise().getId()) {
					criteria.add(Restrictions.eq("merchandise.id", stockorder.getMerchandise().getId()));
				}
			}
			if (null != stockorder.getClient()) {
				if (null != stockorder.getClient().getId()) {
					criteria.add(Restrictions.eq("client.id", stockorder.getClient().getId()));
				}
			}
			if (null != stockorder.getEmployee()) {
				if (null != stockorder.getEmployee().getId()) {
					criteria.add(Restrictions.eq("employee.id", stockorder.getEmployee().getId()));
				}
			}
			if (null != stockorder.getStockorderdate() && stockorder.getStockorderdate().trim().length() > 0) {
				criteria.add(Restrictions.eq("stockorderdate", stockorder.getStockorderdate()));
			}
		}
		return (List<Stockorder>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	@Override
	public void saveStockorder(Stockorder stockorder) {
		this.getHibernateTemplate().save(stockorder);
	}
	@Override
	public List<Stockorder> findStockorderByCode(Stockorder stockorder) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Stockorder.class);
		if (null != stockorder) {
			if (null != stockorder.getCode() && stockorder.getCode().trim().length() > 0) {
				criteria.add(Restrictions.eq("code", stockorder.getCode()));
			}
		}
		return (List<Stockorder>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	@Override
	public void updateStockorder(Stockorder stockorder) {
		Stockorder s = this.getHibernateTemplate().get(Stockorder.class, stockorder.getId());
		s.setCode(stockorder.getCode());
		s.setClient(clientDao.findClient(stockorder.getClient()).get(0));
		s.setMerchandise(merchandiseDao.findMerchandise(stockorder.getMerchandise()).get(0));
		s.setMerchandisenumber(stockorder.getMerchandisenumber());
		s.setEmployee(employeeDao.findEmployee(stockorder.getEmployee()).get(0));
		s.setStockorderdate(stockorder.getStockorderdate());
		this.getHibernateTemplate().update(s);
	}
	@Override
	public void delStockorder(int stockorder) {
		this.getHibernateTemplate().
	        delete(this.getHibernateTemplate().get(Stockorder.class, stockorder));
	}

}
