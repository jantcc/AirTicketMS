package action;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;
import entity.User;

public class UserAction extends ActionSupport{
	private User user;
	private UserService userService;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String UpdateAction(User user){
		userService.UpdateUser(user);
		return "Updatesuccess";
	}
}
