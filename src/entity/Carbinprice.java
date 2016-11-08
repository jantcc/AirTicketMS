package entity;

/**
 * Carbinprice entity. @author MyEclipse Persistence Tools
 */

public class Carbinprice implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer businessprice;
	private Integer firstprice;
	private Integer economyprice;
	private Integer flightid;

	// Constructors

	/** default constructor */
	public Carbinprice() {
	}

	/** full constructor */
	public Carbinprice(Integer businessprice, Integer firstprice,
			Integer economyprice, Integer flightid) {
		this.businessprice = businessprice;
		this.firstprice = firstprice;
		this.economyprice = economyprice;
		this.flightid = flightid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBusinessprice() {
		return this.businessprice;
	}

	public void setBusinessprice(Integer businessprice) {
		this.businessprice = businessprice;
	}

	public Integer getFirstprice() {
		return this.firstprice;
	}

	public void setFirstprice(Integer firstprice) {
		this.firstprice = firstprice;
	}

	public Integer getEconomyprice() {
		return this.economyprice;
	}

	public void setEconomyprice(Integer economyprice) {
		this.economyprice = economyprice;
	}

	public Integer getFlightid() {
		return this.flightid;
	}

	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}

}