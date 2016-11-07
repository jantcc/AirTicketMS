package service.Impl;

import dao.CarbinpriceDao;
import entity.Carbinprice;
import service.CarbinpriceService;

public class CarbinpriceServiceImpl implements CarbinpriceService {
	private CarbinpriceDao carbinpriceDao;
	
	public CarbinpriceDao getCarbinpriceDao() {
		return carbinpriceDao;
	}

	public void setCarbinpriceDao(CarbinpriceDao carbinpriceDao) {
		this.carbinpriceDao = carbinpriceDao;
	}

	public void save(Carbinprice carbinprice) {
		// TODO Auto-generated method stub
		this.carbinpriceDao.save(carbinprice);
	}

}
