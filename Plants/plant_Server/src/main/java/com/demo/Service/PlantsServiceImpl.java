package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Model.Plants;
import com.demo.dao.PlantsDao;

@Service
public class PlantsServiceImpl implements PlantsService{
	
	@Autowired
	PlantsDao pdao;
	
	@Override
	public List<Plants> getAllPlant() {
		return pdao.getAll();
	}

	@Override
	public Plants getSinglePlant(String id) {
		return pdao.getSingleProduct(id);
	}

	

	@Override
	public List<Plants> getPlantByPrice(int offset, int limit) {
		// TODO Auto-generated method stub
		return pdao.getPlantsByPrice(offset,limit);	}

	@Override
	public List<Plants> getPlantByPriceHL(int offset, int limit) {
		// TODO Auto-generated method stub
		return pdao.getPlantsByPriceHL(offset,limit);	
	}

	@Override
	public List<Plants> getAllPlantsLoadedPrice(int offset, int limit, double from, double to) {
		return pdao.getAllLoadedPrice(offset,limit,from,to);
	}

	@Override
	public List<Plants> getLoadedPlantsRating(int offset, int limit, double rating) {
		return pdao.getLoadedPlantsRating(offset,limit,rating);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortPHL1(int offset, int limit, double from, double to) {
		// TODO Auto-generated method stub
		return pdao.getLoadedPlantsFilterSortPHL1(offset,limit,from,to);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortPLH1(int offset, int limit, double from, double to) {
		// TODO Auto-generated method stub
		return pdao.getLoadedPlantsFilterSortPLH1(offset,limit,from,to);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortAZ1(int offset, int limit, double from, double to) {
		// TODO Auto-generated method stub
		return pdao.getLoadedPlantFilterSortAZ1(offset,limit,from,to);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortZA1(int offset, int limit, double from, double to) {
		return pdao.getLoadedPlantFilterSortZA1(offset,limit,from,to);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRHL2(int offset, int limit, double rating) {
		// TODO Auto-generated method stub
		return pdao.getLoadedPlantsFilterSortRHL2(offset,limit,rating);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRLH2(int offset, int limit, double rating) {
		
		return pdao.getLoadedPlantsFilterSortRLH2(offset,limit,rating);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRAZ2(int offset, int limit, double rating) {
		// TODO Auto-generated method stub
	 return pdao.getLoadedPlantsFilterSortRAZ2(offset,limit,rating);
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRZA2(int offset, int limit, double rating) {
		return pdao.getLoadedPlantsFilterSortRZA2(offset,limit,rating);
	}

	

	

}
