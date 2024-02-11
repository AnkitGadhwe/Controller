package com.demo.dao;

import java.util.List;

import com.demo.Model.Plants;

public interface PlantsDao {

	List<Plants> getAll();

	Plants getSingleProduct(String id);

	List<Plants> getPlantsByPrice(int offset, int limit);

	List<Plants> getPlantsByPriceHL(int offset, int limit);

	List<Plants> getAllLoadedPrice(int offset, int limit,double from, double to);

	List<Plants> getLoadedPlantsRating(int offset, int limit,double rating);

	List<Plants> getLoadedPlantsFilterSortPHL1(int offset, int limit, double from, double to);

	List<Plants> getLoadedPlantsFilterSortPLH1(int offset, int limit, double from, double to);

	List<Plants> getLoadedPlantFilterSortAZ1(int offset, int limit, double from, double to);

	List<Plants> getLoadedPlantFilterSortZA1(int offset, int limit, double from, double to);

	List<Plants> getLoadedPlantsFilterSortRHL2(int offset, int limit, double rating);

	List<Plants> getLoadedPlantsFilterSortRLH2(int offset, int limit, double rating);

	List<Plants> getLoadedPlantsFilterSortRAZ2(int offset, int limit, double rating);

	List<Plants> getLoadedPlantsFilterSortRZA2(int offset, int limit, double rating);

	


}
