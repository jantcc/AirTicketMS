package entity;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private Integer id;
	private String companycode;
	private String companyinfo;
	private String companyname;
	private String companyphone;
	private String companyurl;

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** full constructor */
	public Company(String companycode, String companyinfo, String companyname,
			String companyphone, String companyurl) {
		this.companycode = companycode;
		this.companyinfo = companyinfo;
		this.companyname = companyname;
		this.companyphone = companyphone;
		this.companyurl = companyurl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanycode() {
		return this.companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getCompanyinfo() {
		return this.companyinfo;
	}

	public void setCompanyinfo(String companyinfo) {
		this.companyinfo = companyinfo;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanyphone() {
		return this.companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	public String getCompanyurl() {
		return this.companyurl;
	}

	public void setCompanyurl(String companyurl) {
		this.companyurl = companyurl;
	}

}