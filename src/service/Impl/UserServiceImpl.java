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

	public void UpdateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.UpdateUser(user);
	}

	public int UpdateUserPassword(User user,String newpassword) {
		// TODO Auto-generated method stub
		String password = user.getPassword();
		User puser = userDao.FindUser(user.getUsername());
		if(!password.equals(puser.getPassword())){
			return 0;
		}
		return this.userDao.UpdateUserPassword(user,newpassword);
	}



}
