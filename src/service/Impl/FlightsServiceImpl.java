package service.Impl;

import java.util.List;

import dao.FlightDao;
import entity.Flights;
import service.FlightService;

public class FlightsServiceImpl implements FlightService {
	private FlightDao flightDao;

	public FlightDao getFlightDao() {
		return flightDao;
	}

	public void setFlightDao(FlightDao flightDao) {
		this.flightDao = flightDao;
	}

	public void addFlights(Flights flight) {
		// TODO Auto-generated method stub
		this.flightDao.addFlights(flight);
	}

	public List<Flights> findAll() {
		// TODO Auto-generated method stub
		return this.flightDao.findAll();
	}

	public List<Flights> findByCustom(String startpoint, String endpoint,
			String time) {
		// TODO Auto-generated method stub
		return this.flightDao.findByCustom(startpoint, endpoint, time);
	}

	public Flights findById(int id) {
		// TODO Auto-generated method stub
		return this.flightDao.findById(id);
	}

	public Flights findIdByFlightId(String flightid) {
		// TODO Auto-generated method stub
		return this.flightDao.findIdByFlightId(flightid);
	}

}
