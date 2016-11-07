package entity;

import java.sql.Timestamp;

/**
 * Flights entity. @author MyEclipse Persistence Tools
 */

public class Flights implements java.io.Serializable {

	// Fields

	private Integer id;
	private String flightid;
	private String startpoint;
	private String endpoint;
	private String startairport;
	private String endairport;
	private Timestamp starttime;
	private Timestamp endtime;
	private String companyname;
	private String planemodelcode;

	// Constructors

	/** default constructor */
	public Flights() {
	}

	/** minimal constructor */
	public Flights(String flightid, String startpoint, String endpoint,
			String startairport, String endairport, Timestamp starttime,
			Timestamp endtime, String companyname) {
		this.flightid = flightid;
		this.startpoint = startpoint;
		this.endpoint = endpoint;
		this.startairport = startairport;
		this.endairport = endairport;
		this.starttime = starttime;
		this.endtime = endtime;
		this.companyname = companyname;
	}

	/** full constructor */
	public Flights(String flightid, String startpoint, String endpoint,
			String startairport, String endairport, Timestamp starttime,
			Timestamp endtime, String companyname, String planemodelcode) {
		this.flightid = flightid;
		this.startpoint = startpoint;
		this.endpoint = endpoint;
		this.startairport = startairport;
		this.endairport = endairport;
		this.starttime = starttime;
		this.endtime = endtime;
		this.companyname = companyname;
		this.planemodelcode = planemodelcode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getStartairport() {
		return this.startairport;
	}

	public void setStartairport(String startairport) {
		this.startairport = startairport;
	}

	public String getEndairport() {
		return this.endairport;
	}

	public void setEndairport(String endairport) {
		this.endairport = endairport;
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

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getPlanemodelcode() {
		return this.planemodelcode;
	}

	public void setPlanemodelcode(String planemodelcode) {
		this.planemodelcode = planemodelcode;
	}

}