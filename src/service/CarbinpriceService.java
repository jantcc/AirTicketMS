package service;

import entity.Carbinprice;

public interface CarbinpriceService {
	void save(Carbinprice carbinprice);
	Carbinprice findByflightId(int flightid);
}	
