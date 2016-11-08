package dao.Impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.DiscountDao;
import entity.Discount;
import entity.Flights;

public class DiscountDaoImpl implements DiscountDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public void save(Discount discout) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(discout);
		ts.commit();
		hu.closeSession(session);
	}
	public Discount findByCompanyid(int id) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Discount as d where d.companyid=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<Discount> list = query.list();
		Iterator<Discount> iterator = list.iterator();
		if(iterator.hasNext()){
			Discount  discount= iterator.next();
			hu.closeSession(session);
			return discount;
			}else{
				hu.closeSession(session);
				return null;
			}
	}

}
