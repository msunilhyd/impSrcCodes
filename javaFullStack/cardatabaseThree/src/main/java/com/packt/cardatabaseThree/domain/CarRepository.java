package com.packt.cardatabaseThree.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.packt.cardatabaseThree.entity.Car;

public interface CarRepository extends CrudRepository <Car, Long> {

	// Fetch cars by brand  
	List<Car> findByBrand(String brand);  
	
	// Fetch cars by color  
	List<Car> findByColor(String color);  

	// Fetch cars by year  
	List<Car> findByYear(int year);
	
	
	// Fetch cars by brand and model  
	List<Car> findByBrandAndModel(String brand, String model);  
	
	// Fetch cars by brand or color  
	List<Car> findByBrandOrColor(String brand, String color);
	
	// Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);

	// Fetch cars by brand using SQL  
	@Query("select c from Car c where c.brand = ?1")  
	List<Car> findByBrand1(String brand);
	
	// Fetch cars by brand using SQL  
	@Query("select c from Car c where c.brand like %?1")  
	List<Car> findByBrandEndsWith(String brand);

}
