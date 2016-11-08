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
	

}
