package action;

import service.UserService;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;

public class RegistAction extends ActionSupport{
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		userService.SaveUser(user);
		return "Registsuccess";
	}
}
