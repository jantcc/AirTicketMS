package dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.CompanyDao;
import entity.Company;

public class CompanyDaoImpl implements CompanyDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public void save(Company company) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(company);
		ts.commit();
		hu.closeSession(session);
	}
	public Company find(String companycode) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Company as c where c.companycode="+companycode;
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
			Company company = (Company) query.list().get(0);
			hu.closeSession(session);
			return company;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public List<Company> findAll() {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Company ";
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
			List<Company> list = query.list();
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public Company find(int id) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Company as c where c.id="+id;
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
			Company company = (Company) query.list().get(0);
			hu.closeSession(session);
			return company;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
}
