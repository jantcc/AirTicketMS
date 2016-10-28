package service.Impl;

import dao.UserDao;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void SaveUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.SaveUser(user);
	}

	public User FindUser(String username) {
		// TODO Auto-generated method stub
		return this.userDao.FindUser(username);
	}



}
