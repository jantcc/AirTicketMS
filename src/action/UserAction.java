package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import service.UserService;
import entity.User;

public class UserAction extends ActionSupport{
	private User user;
	private UserService userService;
	private String newpassword;
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
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
		return super.execute();
	}
	public String UpdateAction(){
		userService.UpdateUser(user);
		refreshUserSession(user.getUsername());
		return "Updatesuccess";
	}
	
	public void refreshUserSession(String username){
		User puser = userService.FindUser(username);
		ActionContext.getContext().getSession().put("user",puser);  
	}
	public String UpdatePasswordAction(){
		int i = userService.UpdateUserPassword(user,newpassword);
		if(i==0){
			addActionMessage("原密码不正确,请重新输入！");
			return "updatepassworderror";
		}else{
			addActionMessage("密码修改成功！");
		return "UpdatePasswordsuccess";
		}
	}
}
