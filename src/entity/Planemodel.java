package entity;

/**
 * Planemodel entity. @author MyEclipse Persistence Tools
 */

public class Planemodel implements java.io.Serializable {

	// Fields

	private Integer id;
	private String planemodelcode;
	private String firstclassnumber;
	private String businessclassnumber;
	private String economyclassnumber;
	private Integer companyid;

	// Constructors

	/** default constructor */
	public Planemodel() {
	}

	/** full constructor */
	public Planemodel(String planemodelcode, String firstclassnumber,
			String businessclassnumber, String economyclassnumber,
			Integer companyid) {
		this.planemodelcode = planemodelcode;
		this.firstclassnumber = firstclassnumber;
		this.businessclassnumber = businessclassnumber;
		this.economyclassnumber = economyclassnumber;
		this.companyid = companyid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlanemodelcode() {
		return this.planemodelcode;
	}

	public void setPlanemodelcode(String planemodelcode) {
		this.planemodelcode = planemodelcode;
	}

	public String getFirstclassnumber() {
		return this.firstclassnumber;
	}

	public void setFirstclassnumber(String firstclassnumber) {
		this.firstclassnumber = firstclassnumber;
	}

	public String getBusinessclassnumber() {
		return this.businessclassnumber;
	}

	public void setBusinessclassnumber(String businessclassnumber) {
		this.businessclassnumber = businessclassnumber;
	}

	public String getEconomyclassnumber() {
		return this.economyclassnumber;
	}

	public void setEconomyclassnumber(String economyclassnumber) {
		this.economyclassnumber = economyclassnumber;
	}

	public Integer getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}

}