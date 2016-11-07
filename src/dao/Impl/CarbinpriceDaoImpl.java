package dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.CarbinpriceDao;
import entity.Carbinprice;

public class CarbinpriceDaoImpl implements CarbinpriceDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;
	}
	public void save(Carbinprice carbinprice) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(carbinprice);
		ts.commit();
		hu.closeSession(session);
	}
}
