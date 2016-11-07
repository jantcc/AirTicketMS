package dao.Impl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;

import dao.PlanemodelDao;
import entity.Company;
import entity.Planemodel;

public class PlanemodelDaoImpl implements PlanemodelDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public void addPlaneModel(Planemodel planemodel) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(planemodel);
		ts.commit();
		hu.closeSession(session);
	}
	public List<Planemodel> FindAll() {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Planemodel ";
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
			List<Planemodel> list = query.list();
			hu.closeSession(session);
			return list;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	public Planemodel findBycode(String planemodelcode) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from Planemodel as p where p.planemodelcode=?";
		Query query = session.createQuery(hql);
		query.setString(0, planemodelcode);
		List<Planemodel> list = query.list();
		Iterator<Planemodel> iterator = list.iterator();
		if(iterator.hasNext()){
			Planemodel  planemodel= iterator.next();
			hu.closeSession(session);
			return planemodel;
			}else{
				hu.closeSession(session);
				return null;
			}
	}
	
}
