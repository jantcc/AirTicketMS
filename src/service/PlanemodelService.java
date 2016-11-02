package service;

import java.util.List;

import entity.Planemodel;

public interface PlanemodelService {
	
	void addPlaneModel(Planemodel planemodel);
	List<Planemodel> FindAll();
}
