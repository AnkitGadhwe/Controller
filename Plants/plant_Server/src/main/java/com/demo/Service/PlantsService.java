package com.demo.Service;

import java.util.List;

import com.demo.Model.Plants;

public interface PlantsService {

	List<Plants> getAllPlant();

	

	Plants getSinglePlant(String id);



	



	List<Plants> getPlantByPrice(int offset, int limit);



	List<Plants> getPlantByPriceHL(int offset, int limit);



	List<Plants> getAllPlantsLoadedPrice(int offset, int limit, double from, double to);



	List<Plants> getLoadedPlantsRating(int offset, int limit, double rating);



	List<Plants> getLoadedPlantsFilterSortPHL1(int offset, int limit, double from, double to);



	List<Plants> getLoadedPlantsFilterSortPLH1(int offset, int limit, double from, double to);



	List<Plants> getLoadedPlantsFilterSortAZ1(int offset, int limit, double from, double to);



	List<Plants> getLoadedPlantsFilterSortZA1(int offset, int limit, double from, double to);



	List<Plants> getLoadedPlantsFilterSortRHL2(int offset, int limit, double rating);



	List<Plants> getLoadedPlantsFilterSortRLH2(int offset, int limit, double rating);



	List<Plants> getLoadedPlantsFilterSortRAZ2(int offset, int limit, double rating);



	List<Plants> getLoadedPlantsFilterSortRZA2(int offset, int limit, double rating);



	

}
