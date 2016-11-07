package dao.Impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.FlightDao;
import entity.Company;
import entity.Flights;

public class FlightDaoImpl implements FlightDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public void addFlights(Flights flight) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(flight);
		ts.commit();
		hu.closeSession(session);
	}
	public List<Flights> findAll() {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Flights ";
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
			List<Flights> list = query.list();
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public List<Flights> findByCustom(String startpoint, String endpoint,
			String time) {
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Flights as f where f.startpoint=? and f.endpoint=? and f.starttime like ?";
		Query query = session.createQuery(hql);
		query.setString(0, startpoint);
		query.setString(1, endpoint);
		query.setString(2, time+"%");
		List<Flights> list = query.list();
		if(list!=null){
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
}
