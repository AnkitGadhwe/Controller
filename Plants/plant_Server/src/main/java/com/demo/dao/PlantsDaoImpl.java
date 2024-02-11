package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.Model.Plants;

@Repository
public class PlantsDaoImpl implements PlantsDao{
	
	
	@Autowired 
	private JdbcTemplate jdbcTemplate; 

	@Override
	public List<Plants> getAll() {
		List<Plants> plist=jdbcTemplate.query("SELECT * FROM PLANTS",(rs,num)->{
			Plants plants=new Plants();
			plants.setPID(rs.getString(1));
			plants.setPTITLE(rs.getString(2));
			plants.setPDESCRIPTION(rs.getString(3));
			plants.setPRATING(rs.getDouble(4));
			plants.setPPRICE(rs.getString(5));
			plants.setPSTOCKAVAILABILITY(rs.getInt(6));
			plants.setPIMAGES(rs.getString(7));
			
			return plants;
		});
		return plist;

		
	}

	@Override
	public Plants getSingleProduct(String id) {
//		Plants  p = jdbcTemplate.queryForObject("Select * from Plants where id = ?", 
//				new Object[] {id},BeanPropertyRowMapper.newInstance(Books.class));
		  
		@SuppressWarnings("deprecation")
		Plants p=jdbcTemplate.queryForObject("SELECT 8 FROM PLANTS WHERE PID = ?",new Object[] {id},BeanPropertyRowMapper.newInstance(Plants.class));
		
		return p;
	}

	@Override
	public List<Plants> getPlantsByPrice(int offset, int limit) {
		String query = "SELECT * FROM PLANTS ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') ASC LIMIT ? OFFSET ?";
		
	    @SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {limit,offset},
	        (rs, num) -> {
	            Plants plants = new Plants();
	            plants.setPID(rs.getString(1));
	            plants.setPTITLE(rs.getString(2));
	            plants.setPDESCRIPTION(rs.getString(3));
	            plants.setPRATING(rs.getDouble(4));
	            plants.setPPRICE(rs.getString(5));
	            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
	            plants.setPIMAGES(rs.getString(7));
	            return plants;
	        });
	    return plist;
	}

	@Override
	public List<Plants> getPlantsByPriceHL(int offset, int limit) {
String query = "SELECT * FROM PLANTS ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') DESC LIMIT ? OFFSET ?";
		
	    @SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {limit,offset},
	        (rs, num) -> {
	            Plants plants = new Plants();
	            plants.setPID(rs.getString(1));
	            plants.setPTITLE(rs.getString(2));
	            plants.setPDESCRIPTION(rs.getString(3));
	            plants.setPRATING(rs.getDouble(4));
	            plants.setPPRICE(rs.getString(5));
	            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
	            plants.setPIMAGES(rs.getString(7));
	            return plants;
	        });
	    return plist;
	}

	@Override
	public List<Plants> getAllLoadedPrice(int offset, int limit,double from, double to) {
		String query = "SELECT * FROM PLANTS WHERE JSON_EXTRACT(PPRICE, '$[0].SP') BETWEEN ? AND ? LIMIT ? OFFSET ?";
		
		@SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {from,to,limit,offset},
	        (rs, num) -> {
	            Plants plants = new Plants();
	            plants.setPID(rs.getString(1));
	            plants.setPTITLE(rs.getString(2));
	            plants.setPDESCRIPTION(rs.getString(3));
	            plants.setPRATING(rs.getDouble(4));
	            plants.setPPRICE(rs.getString(5));
	            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
	            plants.setPIMAGES(rs.getString(7));
	            return plants;
	        });
	    return plist;
		
		
	}

	public List<Plants> getLoadedPlantsRating(int offset, int limit,double rating) {
		String query = "SELECT * FROM PLANTS WHERE PRATING = ? LIMIT ? OFFSET ?";
		@SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {rating,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
			
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantsFilterSortPHL1(int offset, int limit, double from, double to) {
		String query="SELECT * FROM PLANTS WHERE JSON_EXTRACT(PPRICE, '$[0].SP') BETWEEN ? AND ? ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') DESC LIMIT ? OFFSET ?";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {from,to,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantsFilterSortPLH1(int offset, int limit, double from, double to) {
		String query="SELECT * FROM PLANTS WHERE JSON_EXTRACT(PPRICE, '$[0].SP') BETWEEN ? AND ? ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') ASC LIMIT ? OFFSET ?";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {from,to,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantFilterSortAZ1(int offset, int limit, double from, double to) {
		String query ="SELECT * FROM PLANTS WHERE JSON_EXTRACT(PPRICE, '$[0].SP') BETWEEN ? AND ? ORDER BY PTITLE ASC LIMIT ? OFFSET ? ";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {from,to,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantFilterSortZA1(int offset, int limit, double from, double to) {
		String query ="SELECT * FROM PLANTS WHERE JSON_EXTRACT(PPRICE, '$[0].SP') BETWEEN ? AND ? ORDER BY PTITLE DESC LIMIT ? OFFSET ? ";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {from,to,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantsFilterSortRHL2(int offset, int limit, double rating) {
		String query ="SELECT * FROM PLANTS WHERE PRATING = ? ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') DESC LIMIT ? OFFSET ? ";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {rating,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Plants> getLoadedPlantsFilterSortRLH2(int offset, int limit, double rating) {
		String query ="SELECT * FROM PLANTS WHERE PRATING = ? ORDER BY JSON_EXTRACT(PPRICE, '$[0].SP') ASC LIMIT ? OFFSET ? ";
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {rating,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRAZ2(int offset, int limit, double rating) {
		String query = "SELECT * FROM PLANTS WHERE PRATING = ? ORDER BY PTITLE ASC LIMIT ? OFFSET ?";
		
		@SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {rating,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}

	@Override
	public List<Plants> getLoadedPlantsFilterSortRZA2(int offset, int limit, double rating) {
String query = "SELECT * FROM PLANTS WHERE PRATING = ? ORDER BY PTITLE DESC LIMIT ? OFFSET ?";
		
		@SuppressWarnings("deprecation")
		List<Plants> plist = jdbcTemplate.query(query,new Object[] {rating,limit,offset},
		        (rs, num) -> {
		            Plants plants = new Plants();
		            plants.setPID(rs.getString(1));
		            plants.setPTITLE(rs.getString(2));
		            plants.setPDESCRIPTION(rs.getString(3));
		            plants.setPRATING(rs.getDouble(4));
		            plants.setPPRICE(rs.getString(5));
		            plants.setPSTOCKAVAILABILITY(rs.getInt(6));
		            plants.setPIMAGES(rs.getString(7));
		            return plants;
		        });
		    return plist;
	}


	

}




