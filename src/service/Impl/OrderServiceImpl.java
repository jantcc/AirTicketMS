package service.Impl;

import java.util.List;

import dao.OrderDao;
import entity.Order;
import service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDao;

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public void save(Order order) {
		this.orderDao.save(order);
		
	}

	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return this.orderDao.findByUsername(username);
	}

	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return this.orderDao.findAll();
	}

	public List<Order> findReturnOrder() {
		// TODO Auto-generated method stub
		return this.orderDao.findReturnOrder();
	}

	public void delOrder(int id) {
		// TODO Auto-generated method stub
		this.orderDao.delOrder(id);
	}

	public void updatestatustoreturn(int id) {
		// TODO Auto-generated method stub
		this.orderDao.updatestatustoreturn(id);
	}

	public List<Order> findById(int id,String username) {
		// TODO Auto-generated method stub
		return this.orderDao.findById(id,username);
	}

	public List<Order> findByDate(String time,String username) {
		// TODO Auto-generated method stub
		return this.orderDao.findByDate(time,username);
	}



}
