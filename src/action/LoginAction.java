package action;


import service.UserService;

import com.opensymphony.xwork2.ActionSupport;

import entity.User;


public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private UserService userService;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() throws Exception {
		if ("123".equals(username)) {
			User user = new User(username,password);
			userService.SaveUser(user);
			return SUCCESS;

		} else {

			return INPUT;
		}

	}


}
