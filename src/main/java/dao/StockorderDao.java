package dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

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

}
