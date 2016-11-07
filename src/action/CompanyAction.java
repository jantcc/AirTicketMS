package action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import service.CarbinpriceService;
import service.CompanyService;
import service.DiscountService;
import service.FlightService;
import service.PlanemodelService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Carbinprice;
import entity.Company;
import entity.Discount;
import entity.Flights;
import entity.Planemodel;

public class CompanyAction extends ActionSupport {
	private Company company;
	private Discount discount;
	private Planemodel planemodel;
	private Flights flights;
	private Carbinprice carbinprice;
	private DiscountService discountService;
	private CompanyService companyService;
	private PlanemodelService planemodelService;
	private FlightService flightService;
	private CarbinpriceService carbinpriceService;
	public Carbinprice getCarbinprice() {
		return carbinprice;
	}
	public void setCarbinprice(Carbinprice carbinprice) {
		this.carbinprice = carbinprice;
	}
	public Flights getFlights() {
		return flights;
	}
	public void setFlights(Flights flights) {
		this.flights = flights;
	}
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
	
	public Planemodel getPlanemodel() {
		return planemodel;
	}
	public void setPlanemodel(Planemodel planemodel) {
		this.planemodel = planemodel;
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
	
	public PlanemodelService getPlanemodelService() {
		return planemodelService;
	}
	public void setPlanemodelService(PlanemodelService planemodelService) {
		this.planemodelService = planemodelService;
	}
	
	public FlightService getFlightService() {
		return flightService;
	}
	public void setFlightService(FlightService flightService) {
		this.flightService = flightService;
	}
	public CarbinpriceService getCarbinpriceService() {
		return carbinpriceService;
	}
	public void setCarbinpriceService(CarbinpriceService carbinpriceService) {
		this.carbinpriceService = carbinpriceService;
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
	public String showCompany(){
		String locationurl = ServletActionContext.getRequest().getParameter("locationurl");
		List<Company> list  =companyService.findAll();
		ActionContext.getContext().getSession().put("list",list);  
		if("companyhaveplane".equals(locationurl)){
			return "successtocompanyhaveplane";
		}else if("addFlights".equals(locationurl)){
			List<Planemodel> planemodels  = planemodelService.FindAll();
			ActionContext.getContext().getSession().put("planemodellist",planemodels);  
			return "successtoaddflights";
		}
		else{
			return "success";
		}
	}
	public String showCompanyName(){
		List<Company> list  =companyService.findAll();
		ActionContext.getContext().getSession().put("list",list);  
		return "success";
	}
	public String addPlaneModel(){
		planemodel.setCompanyid(company.getId());
		planemodelService.addPlaneModel(planemodel);
		return "success";
	}
	public String showAllPlaneModel(){
		List<Planemodel> list = planemodelService.FindAll();
		ActionContext.getContext().getSession().put("list",list);  
		return "success";
	}
	public String showCompanyHaveandHaventModel(){
		int selectCompanyid = company.getId();
		Company pcompany = companyService.find(selectCompanyid);
		List<Planemodel> list = planemodelService.FindAll();
		List<Planemodel> alreadyhaveList = new ArrayList<Planemodel>();
		Iterator<Planemodel> iterator = list.iterator();
		while(iterator.hasNext()){
			Planemodel planemodel = iterator.next();
			if(selectCompanyid==planemodel.getCompanyid()){
				alreadyhaveList.add(planemodel);
			}
		}
		list.removeAll(alreadyhaveList);
		ActionContext.getContext().getSession().put("companyName",pcompany.getCompanyname()); 
		ActionContext.getContext().getSession().put("canaddlist",list);  		
		ActionContext.getContext().getSession().put("alreadyhavelist",alreadyhaveList);  
		return "success";
	}
	public String addFlights(){
		flightService.addFlights(flights);
		carbinprice.setFlightid(flights.getFlightid());
		carbinpriceService.save(carbinprice);
		return "success";
	}
	public String showFlights(){
		List<Flights> list = flightService.findAll();
		ActionContext.getContext().getSession().put("flightlist",list); 
		return "success";
	}
	public String showFlightscustom(){
		String locationurl = ServletActionContext.getRequest().getParameter("locationurl");
		List<Flights> list = flightService.findByCustom(flights.getStartpoint(), flights.getEndpoint(), flights.getStarttime().toString().substring(0,10));
		ActionContext.getContext().getSession().put("flightlist",list); 
		if(list==null && "flights".equals(locationurl)){
			addActionMessage("未找到该行程的航班记录,请重新输入！"); 
			return "error1";
		}
		if("flights".equals(locationurl)){
			Iterator<Flights> iterator = list.iterator();
			List<Planemodel> plist = new ArrayList<Planemodel>();
			while(iterator.hasNext()){
				Flights flights = iterator.next();
				Planemodel planemodel = planemodelService.findBycode(flights.getPlanemodelcode());
				plist.add(planemodel);
			}
			ActionContext.getContext().getSession().put("plist",plist); 
			return "successtoflights";
		}else{
		return "success";
		}
	}
}
