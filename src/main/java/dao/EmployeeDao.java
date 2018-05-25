package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Employee;

public class EmployeeDao extends HibernateDaoSupport implements IEmployeeDao{

	@Override
	public List<Employee> findEmployee(Employee employee) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		if(null != employee) {
			if(null != employee.getId()){
				criteria.add(Restrictions.eq("id", employee.getId()));
			}
			if(null != employee.getCode() && employee.getCode().trim().length()>0) {
				criteria.add(Restrictions.eq("code", employee.getCode()));
			}
			if(null != employee.getName() && employee.getName().trim().length()>0) {
				criteria.add(Restrictions.like("name", employee.getName(),MatchMode.ANYWHERE));
			}
		}
		return (List<Employee>) this.getHibernateTemplate().findByCriteria(criteria);
	}

	@Override
	public void saveEmployee(Employee employee) {
		getHibernateTemplate().save(employee);
	}

	@Override
	public List<Employee> findEmployeeByCode(Employee employee) {
		DetachedCriteria criteria=DetachedCriteria.forClass(Employee.class);
		if(null != employee) {
			if(null != employee.getCode() && employee.getCode().trim().length()>0) {
				criteria.add(Restrictions.eq("code", employee.getCode()));
			}
		}
		return (List<Employee>) this.getHibernateTemplate().findByCriteria(criteria);
	}
	
	@Override
	public void updateEmployee(Employee employee) {
		Employee e=this.getHibernateTemplate().get(Employee.class, employee.getId());
		e.setCode(employee.getCode());
		e.setName(employee.getName());
		e.setSex(employee.getSex());
		e.setBirthday(employee.getBirthday());
		e.setTelephone(employee.getTelephone());
		e.setEmail(employee.getEmail());
		this.getHibernateTemplate().update(e);
	}

	@Override
	public void delEmployee(int employee) {
		Employee e=this.getHibernateTemplate().get(Employee.class, employee);
		this.getHibernateTemplate().delete(e);
	}

}
