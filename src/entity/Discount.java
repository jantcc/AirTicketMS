package entity;

/**
 * Discount entity. @author MyEclipse Persistence Tools
 */

public class Discount implements java.io.Serializable {

	// Fields

	private Integer id;
	private Float childen;
	private Float gloduser;
	private Float silveruser;
	private Integer companyid;

	// Constructors

	/** default constructor */
	public Discount() {
	}

	/** full constructor */
	public Discount(Float childen, Float gloduser, Float silveruser,
			Integer companyid) {
		this.childen = childen;
		this.gloduser = gloduser;
		this.silveruser = silveruser;
		this.companyid = companyid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Float getChilden() {
		return this.childen;
	}

	public void setChilden(Float childen) {
		this.childen = childen;
	}

	public Float getGloduser() {
		return this.gloduser;
	}

	public void setGloduser(Float gloduser) {
		this.gloduser = gloduser;
	}

	public Float getSilveruser() {
		return this.silveruser;
	}

	public void setSilveruser(Float silveruser) {
		this.silveruser = silveruser;
	}

	public Integer getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}

}