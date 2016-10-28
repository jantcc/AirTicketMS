package action;


import service.UserService;

import com.opensymphony.xwork2.ActionContext;
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
		User user = userService.FindUser(username);
		if(user==null){
			//返回页面  账号不存在,请先进行注册
	        addActionMessage("账号不存在,请先进行注册");  
			return "Loginerror";
		}
		if (password.equals(user.getPassword())) {
			//登陆成功 跳转
			return "Loginsuccess";

		} else {
			addActionMessage("账号密码错误,请重新输入"); 
			return "Loginerror";
		}

	}


}
