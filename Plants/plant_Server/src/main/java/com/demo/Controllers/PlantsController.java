package com.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Model.Plants;
import com.demo.Service.PlantsService;

@RestController
@CrossOrigin(value="*")
public class PlantsController {
	
	@Autowired
	PlantsService pservice;
	
	@GetMapping("/plants")
	public ResponseEntity<List<Plants>> getAllPlants() {
		List<Plants> plist = pservice.getAllPlant();
		return ResponseEntity.ok(plist);
	}
	
	@GetMapping("/plants/{id}")
	public ResponseEntity<Plants>getSinglePlant(@PathVariable String id){
		 Plants p=pservice.getSinglePlant(id);
			if(p!=null)
			   return ResponseEntity.ok(p);
			else
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 
	}
	  
	@GetMapping("/plants/load/by_price")
	public ResponseEntity<List<Plants>> getLoadedPlantsPrice(@RequestParam int offset,@RequestParam int limit, @RequestParam double from, @RequestParam double to){
		List<Plants> list = pservice.getAllPlantsLoadedPrice(offset, limit, from, to);
		return ResponseEntity.ok(list);
	}
	  
	
	@GetMapping("/plants/Low_to_High")
	public ResponseEntity<List<Plants>> SortByPriceLH(@RequestParam int offset,@RequestParam int limit){
		List<Plants> list = pservice.getPlantByPrice(offset,limit);
	         if(list!=null)
	        	 return ResponseEntity.ok(list);
	         else 
	        	 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@GetMapping("/plants/High_to_Low")
	public ResponseEntity<List<Plants>> SortByPriceHL(@RequestParam int offset,@RequestParam int limit){
		List<Plants> list = pservice.getPlantByPriceHL(offset,limit);
	         if(list!=null)
	        	 return ResponseEntity.ok(list);
	         else 
	        	 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	
	@GetMapping("/plants/load/by_price_High_to_Low")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortPHL1(@RequestParam int offset,@RequestParam int limit,@RequestParam double from,@RequestParam double to){
		List<Plants> list = pservice.getLoadedPlantsFilterSortPHL1(offset,limit,from,to);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/plants/load/by_price_Low_to_High")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortPLH1(@RequestParam int offset,@RequestParam int limit,@RequestParam double from,@RequestParam double to){
		List<Plants> list = pservice.getLoadedPlantsFilterSortPLH1(offset,limit,from,to);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/plants/load/by_price_A_to_Z")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortAZ1(@RequestParam int offset, @RequestParam int limit, @RequestParam double from,@RequestParam double to ){
		List<Plants> list =pservice.getLoadedPlantsFilterSortAZ1(offset,limit,from,to);
		return ResponseEntity.ok(list);
	}
	@GetMapping("/plants/load/by_price_Z_to_A")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortZA1(@RequestParam int offset, @RequestParam int limit, @RequestParam double from,@RequestParam double to ){
		List<Plants> list =pservice.getLoadedPlantsFilterSortZA1(offset,limit,from,to);
		return ResponseEntity.ok(list);
	}
	
	
	
	@GetMapping("/plants/load/by_rating")
	public ResponseEntity<List<Plants>> getLoadedPlantsRating(@RequestParam int offset,@RequestParam int limit, @RequestParam double rating) {
		List<Plants> pp2list = pservice.getLoadedPlantsRating(offset, limit, rating);
		return ResponseEntity.ok(pp2list);
	}
	
	@GetMapping("/plants/load/by_rating_High_to_Low")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortRHL2(@RequestParam int offset,@RequestParam int limit,@RequestParam double rating){
		List<Plants> list = pservice.getLoadedPlantsFilterSortRHL2(offset,limit,rating);
		return ResponseEntity.ok(list);
	}
	@GetMapping("/plants/load/by_rating_Low_to_High")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortRLH2(@RequestParam int offset,@RequestParam int limit,@RequestParam double rating){
		List<Plants> list = pservice.getLoadedPlantsFilterSortRLH2(offset,limit,rating);
		return ResponseEntity.ok(list);
	}
	@GetMapping("/plants/load/by_rating_A_to_Z")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortRAZ2(@RequestParam int offset,@RequestParam int limit,@RequestParam double rating){
		List<Plants> list = pservice.getLoadedPlantsFilterSortRAZ2(offset,limit,rating);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/plants/load/by_rating_Z_to_A")
	public ResponseEntity<List<Plants>> getLoadedPlantsFilterSortRZA2(@RequestParam int offset,@RequestParam int limit,@RequestParam double rating){
		List<Plants> list = pservice.getLoadedPlantsFilterSortRZA2(offset,limit,rating);
		return ResponseEntity.ok(list);
	}
}





