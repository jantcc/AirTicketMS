package entity;

import java.sql.Timestamp;

public class User {
	private int id;
	private String username;
	private String password;
	private String sex;
	private String realname;
	private String idcard;
	private String phone;
	private String email;
	private String usertype;
	private int points;
	private Timestamp registetime;
	private int authority;
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Timestamp getRegistetime() {
		return registetime;
	}
	public void setRegistetime(Timestamp registetime) {
		this.registetime = registetime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", sex=" + sex + ", realname=" + realname
				+ ", idcard=" + idcard + ", phone=" + phone + ", email="
				+ email + ", usertype=" + usertype + ", points=" + points
				+ ", registetime=" + registetime + ", authority=" + authority
				+ "]";
	}

}
