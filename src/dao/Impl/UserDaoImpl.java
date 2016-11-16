package dao.Impl;

import java.util.Iterator;
import java.util.List;

import entity.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import utils.HibernateUtils;
import dao.UserDao;

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
		String hql = "from User as u where u.username=?";
		Query query = session.createQuery(hql);
		query.setString(0,username);
		List<User> list =query.list();
		Iterator<User> iterator = list.iterator();
		if(iterator.hasNext()){
			User  user= iterator.next();
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
	public int UpdateUserPassword(User user,String newpassword) {
		// TODO Auto-generated method stub
		HibernateUtils hu = new HibernateUtils();
		Session session = hu.getSession();
		Transaction ts = session.beginTransaction();
		String hql="update User as u set u.password=? where u.id=?";
		Query query = session.createQuery(hql);
		query.setString(0, newpassword);
		query.setInteger(1, user.getId());
		query.executeUpdate();
		ts.commit();
		hu.closeSession(session);
		return 1;
	}



}
