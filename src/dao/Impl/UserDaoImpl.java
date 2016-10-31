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
		hu.closeSession(session);
		return user;
		}else{
			hu.closeSession(session);
			return null;
		}
	}
	public void UpdateUser(User user) {
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		String hql = "update User as u set u.sex=?,u.realname=?,u.idcard=?,u.phone=?,u.email=? where u.id=?";
		Query query = session.createQuery(hql);
		query.setString(0, user.getSex());
		query.setString(1, user.getRealname());
		query.setString(2, user.getIdcard());
		query.setString(3, user.getPhone());
		query.setString(4, user.getEmail());
		query.setInteger(5, user.getId());
		query.executeUpdate();
		ts.commit();
		hu.closeSession(session);
	}



}
