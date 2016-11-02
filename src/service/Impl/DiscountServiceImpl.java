package service.Impl;

import dao.DiscountDao;
import entity.Discount;
import service.DiscountService;

public class DiscountServiceImpl implements DiscountService {
	private DiscountDao discountDao;
	
	public DiscountDao getDiscountDao() {
		return discountDao;
	}

	public void setDiscountDao(DiscountDao discountDao) {
		this.discountDao = discountDao;
	}

	public void save(Discount discout) {
		// TODO Auto-generated method stub
		this.discountDao.save(discout);
	}

}
