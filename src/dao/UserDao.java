package dao;

import entity.User;

public interface UserDao {
	int SaveUser(User user);
	User FindUser(String username);
	void UpdateUser(User user);
}
