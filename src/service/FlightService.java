package service;

import java.util.List;

import entity.Flights;

public interface FlightService {
	void addFlights(Flights flight);
	List<Flights> findAll();
	List<Flights> findByCustom(String startpoint,String endpoint,String time);
	Flights findById(int id);
	Flights findIdByFlightId(String flightid);
}
