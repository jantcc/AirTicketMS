package dao;

import java.util.List;

import entity.Planemodel;

public interface PlanemodelDao {
	void addPlaneModel(Planemodel planemodel);
	List<Planemodel> FindAll();
	Planemodel findBycode(String planemodelcode);
}
