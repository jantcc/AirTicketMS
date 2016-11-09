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
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Order";
		Query query = session.createQuery(hql);
		List<Order> list = query.list();
		if(list!=null){
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public List<Order> findReturnOrder() {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Order as o where o.orderstatus=?";
		Query query = session.createQuery(hql);
		query.setString(0, "退票中");
		List<Order> list = query.list();
		if(list!=null){
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public void delOrder(int id) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		String hql = "delete Order as o where o.id=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		query.executeUpdate();
		ts.commit();
		hu.closeSession(session);
	}
	public void updatestatustoreturn(int id) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		String hql = "update Order as o set o.orderstatus=? where o.id=?";
		Query query = session.createQuery(hql);
		query.setString(0, "退票中");
		query.setInteger(1, id);
		query.executeUpdate();
		ts.commit();
		hu.closeSession(session);
	}
	public List<Order> findById(int id,String username) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Order as o where o.id=? and o.username=?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		query.setString(1, username);
		List<Order> list = query.list();
		if(list!=null){
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public List<Order> findByDate(String time,String username) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Order as o where o.starttime like ? and o.username=?";
		Query query = session.createQuery(hql);
		query.setString(0, time+"%");
		query.setString(1, username);
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
