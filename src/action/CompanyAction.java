package action;

import service.CompanyService;
import service.DiscountService;

import com.opensymphony.xwork2.ActionSupport;

import entity.Company;
import entity.Discount;

public class CompanyAction extends ActionSupport {
	private Company company;
	private Discount discount;
	private DiscountService discountService;
	private CompanyService companyService;
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	public CompanyService getCompanyService() {
		return companyService;
	}
	public void setCompanyService(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	public DiscountService getDiscountService() {
		return discountService;
	}
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public String addCompany(){
		companyService.save(company);
		setCompanyDiscout();
		return "addsuccess";
	}
	
	public void setCompanyDiscout(){
		Company pCompany = companyService.find(company.getCompanycode());
		discount.setCompanyid(pCompany.getId());
		discountService.save(discount);
	}
}
