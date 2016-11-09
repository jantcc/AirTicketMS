package action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import service.CarbinpriceService;
import service.CompanyService;
import service.DiscountService;
import service.FlightService;
import service.OrderService;
import service.PlanemodelService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import entity.Carbinprice;
import entity.Company;
import entity.Discount;
import entity.Flights;
import entity.Order;
import entity.Planemodel;
import entity.User;

public class CompanyAction extends ActionSupport {
	private Company company;
	private Order order;
	private Discount discount;
	private Planemodel planemodel;
	private Flights flights;
	private Carbinprice carbinprice;
	private DiscountService discountService;
	private CompanyService companyService;
	private PlanemodelService planemodelService;
	private FlightService flightService;
	private CarbinpriceService carbinpriceService;
	private OrderService orderService;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
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
	
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
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
		carbinprice.setFlightid(flightService.findIdByFlightId(flights.getFlightid()).getId());
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
		if(list.size()==0 && "flights".equals(locationurl)){
			addActionMessage("未找到该行程的航班记录,请重新输入！"); 
			String flag = ServletActionContext.getRequest().getParameter("flag");
			if("g".equals(flag)) return "error2";
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
	public String showOrders(){
		String pid =  ServletActionContext.getRequest().getParameter("myid");
		Flights pflights = flightService.findById(Integer.parseInt(pid));
		//可以通过flightid拿到舱位价格
		ActionContext.getContext().getSession().put("flight",pflights);
		String type = ServletActionContext.getRequest().getParameter("planemodeltype");
		ActionContext.getContext().getSession().put("type",type);
		Carbinprice pCarbinprice = carbinpriceService.findByflightId(pflights.getId());
		String companyname = pflights.getCompanyname();
		Company pCompany = companyService.findByname(companyname);
		//可以通过公司id拿到成人小孩 金牌用户 银牌用户价格
		Discount pDiscount = discountService.findByCompanyid(pCompany.getId());
		User user = (User) ActionContext.getContext().getSession().get("user");
		String usertype = user.getUsertype();
		if("头等舱".equals(type)){
			int firstprice = pCarbinprice.getFirstprice();
			ActionContext.getContext().getSession().put("baseprice",firstprice);
			if("0".equals(usertype)) {
				Float childprice=pDiscount.getChilden()*firstprice;
				ActionContext.getContext().getSession().put("myuserType","普通客户");
				ActionContext.getContext().getSession().put("childprice",childprice);
				ActionContext.getContext().getSession().put("adultprice",firstprice);
			}else if("1".equals(usertype)){
				Float price=pDiscount.getSilveruser()*firstprice;
				ActionContext.getContext().getSession().put("myuserType","银牌客户");
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}else{
				Float price=pDiscount.getGloduser()*firstprice;
				ActionContext.getContext().getSession().put("myuserType","金牌客户");
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}
		}else if("经济舱".equals(type)){
			int businessprice = pCarbinprice.getBusinessprice();
			ActionContext.getContext().getSession().put("baseprice",businessprice);
			if("0".equals(usertype)) {
				Float childprice=pDiscount.getChilden()*businessprice;
				ActionContext.getContext().getSession().put("childprice",childprice);
				ActionContext.getContext().getSession().put("adultprice",businessprice);
			}else if("1".equals(usertype)){
				Float price=pDiscount.getSilveruser()*businessprice;
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}else{
				Float price=pDiscount.getGloduser()*businessprice;
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}
		}else{
			int economyprice = pCarbinprice.getEconomyprice();
			ActionContext.getContext().getSession().put("baseprice",economyprice);
			if("0".equals(usertype)) {
				Float childprice=pDiscount.getChilden()*economyprice;
				ActionContext.getContext().getSession().put("childprice",childprice);
				ActionContext.getContext().getSession().put("adultprice",economyprice);
			}else if("1".equals(usertype)){
				Float price=pDiscount.getSilveruser()*economyprice;
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}else{
				Float price=pDiscount.getGloduser()*economyprice;
				ActionContext.getContext().getSession().put("childprice",price);
				ActionContext.getContext().getSession().put("adultprice",price);
			}
		}
		return "success";
	}
	public String addOrder(){
		String flightid = ServletActionContext.getRequest().getParameter("myflightid");
		Flights pflights = flightService.findIdByFlightId(flightid);
		String age = ServletActionContext.getRequest().getParameter("age");
		String adultprice = ServletActionContext.getRequest().getParameter("myadultprice");
		String childprice = ServletActionContext.getRequest().getParameter("mychildprice");
		User user = (User) ActionContext.getContext().getSession().get("user");
		order.setUsername(user.getUsername());
		if("adult".equals(age)) {order.setPrice(adultprice);}
		else{
				order.setPrice(childprice);
		}
		order.setFlightid(pflights.getFlightid());
		order.setStartpoint(pflights.getStartpoint());
		order.setStartairport(pflights.getStartairport());
		order.setEndairport(pflights.getEndairport());
		order.setEndpoint(pflights.getEndpoint());
		order.setStarttime(pflights.getStarttime());
		order.setEndtime(pflights.getEndtime());
		order.setOrderstatus("待付款");
		orderService.save(order);
		return "success";
	}
	public String showbookinfo(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		List<Order> list = orderService.findByUsername(user.getUsername());
		ActionContext.getContext().getSession().put("orderlist",list);
		return "success";
	}
	public String showorderconfirm(){
		List<Order> list = orderService.findAll();
		ActionContext.getContext().getSession().put("list",list);
		return "success";
	}
	public String showdelorderconfirm(){
		List<Order> list = orderService.findReturnOrder();
		ActionContext.getContext().getSession().put("list",list);
		return "success";
	}
	public String delorder(){
		String id = ServletActionContext.getRequest().getParameter("id");
		orderService.delOrder(Integer.parseInt(id));
		return "success";
	}
	public String changeorderstatus(){
		String id = ServletActionContext.getRequest().getParameter("id");
		orderService.updatestatustoreturn(Integer.parseInt(id));
		return "success";
	}
	public String findOrderById(){
		String id = ServletActionContext.getRequest().getParameter("myid");
		User user = (User) ActionContext.getContext().getSession().get("user");
		List<Order> list =  orderService.findById(Integer.parseInt(id),user.getUsername());
		ActionContext.getContext().getSession().put("orderlist",list);
		return "success";
	}
	public String findOrderByDate(){
		String time = ServletActionContext.getRequest().getParameter("mytime");
		User user = (User) ActionContext.getContext().getSession().get("user");
		List<Order> list = orderService.findByDate(time,user.getUsername());
		ActionContext.getContext().getSession().put("orderlist",list);
		return "success";
	}
}
