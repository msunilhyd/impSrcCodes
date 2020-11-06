package com.packt.cardatabase.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>{
//	Fetch cars by brand
	List<Car> findByBrand(String brand);
	
//	Fetch cars by color
	List<Car> findByColor(String color);
	
//	Fetch cars by year
	List<Car> findByYear(int year);
	
//	Fetch cars by brand and model
	List<Car> findByBrandAndModel(String brand, String model);
	
//	Fetch cars by brand or color
	List<Car> findByBrandOrColor(String brand, String color);
	
//	Fetch cars by brand and sort by year
	List<Car> findByBrandOrderByYearAsc(String brand);
	
//	Fetch cars by brand using SQL
	@Query("select c from Car c where c.brand = ?1")
	List<Car> findByBrandWithQuery(String brand);
	
//	Fetch cars by brand using SQL advanced
	@Query("select c from Car c where c.brand like %?1")
	List<Car> findByBrandEndsWith(String brand);
}
