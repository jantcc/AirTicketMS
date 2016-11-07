package dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.FlightDao;
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
}
