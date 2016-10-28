package service;

import entity.User;

public interface UserService {
	void SaveUser(User user);
	User FindUser(String username);
}
