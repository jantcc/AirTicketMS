package dao;

import entity.Carbinprice;

public interface CarbinpriceDao {
	void save(Carbinprice carbinprice);
	Carbinprice findByflightId(int flightid);
}
