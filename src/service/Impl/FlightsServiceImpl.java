package service.Impl;

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

}
