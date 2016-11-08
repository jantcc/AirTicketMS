package dao.Impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.OrderDao;
import entity.Flights;
import entity.Order;
import entity.Planemodel;

public class OrderDaoImpl implements OrderDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public void save(Order order) {
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(order);
		ts.commit();
		hu.closeSession(session);
		
	}
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Order as o where o.username=?";
		Query query = session.createQuery(hql);
		query.setString(0, username);
		List<Order> list = query.list();
		if(list!=null){
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
}
