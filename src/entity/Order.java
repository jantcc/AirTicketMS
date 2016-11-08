package entity;

import java.sql.Timestamp;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String flightid;
	private String startpoint;
	private String endpoint;
	private Timestamp starttime;
	private Timestamp endtime;
	private String onplaneuser;
	private String onplaneuserphone;
	private String onplaneuseridcard;
	private String address;
	private String price;
	private String orderstatus;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(String username, String flightid, String startpoint,
			String endpoint, Timestamp starttime, Timestamp endtime,
			String onplaneuser, String onplaneuserphone,
			String onplaneuseridcard, String address, String price,
			String orderstatus) {
		this.username = username;
		this.flightid = flightid;
		this.startpoint = startpoint;
		this.endpoint = endpoint;
		this.starttime = starttime;
		this.endtime = endtime;
		this.onplaneuser = onplaneuser;
		this.onplaneuserphone = onplaneuserphone;
		this.onplaneuseridcard = onplaneuseridcard;
		this.address = address;
		this.price = price;
		this.orderstatus = orderstatus;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFlightid() {
		return this.flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getStartpoint() {
		return this.startpoint;
	}

	public void setStartpoint(String startpoint) {
		this.startpoint = startpoint;
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getOnplaneuser() {
		return this.onplaneuser;
	}

	public void setOnplaneuser(String onplaneuser) {
		this.onplaneuser = onplaneuser;
	}

	public String getOnplaneuserphone() {
		return this.onplaneuserphone;
	}

	public void setOnplaneuserphone(String onplaneuserphone) {
		this.onplaneuserphone = onplaneuserphone;
	}

	public String getOnplaneuseridcard() {
		return this.onplaneuseridcard;
	}

	public void setOnplaneuseridcard(String onplaneuseridcard) {
		this.onplaneuseridcard = onplaneuseridcard;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getOrderstatus() {
		return this.orderstatus;
	}

	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}

}