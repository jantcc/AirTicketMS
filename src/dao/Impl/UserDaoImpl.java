package dao.Impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;
import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
	    this.sessionFactory = sessionFactory;

	}
	public int SaveUser(User user) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		session.save(user);
		ts.commit();
		hu.closeSession(session);
		return 0;
	}
	public User FindUser(String username){
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		String hql = "from User as u where u.username="+username;
		Query query = session.createQuery(hql);
		if(query.list().size()!=0){
		User user = (User) query.list().get(0);
		return user;
		}else{
			return null;
		}
	}

}
