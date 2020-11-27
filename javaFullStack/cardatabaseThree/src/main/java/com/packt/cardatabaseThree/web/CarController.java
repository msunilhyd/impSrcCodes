package com.packt.cardatabaseThree.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardatabaseThree.CardatabaseThreeApplication;
import com.packt.cardatabaseThree.domain.CarRepository;
import com.packt.cardatabaseThree.entity.Car;

@RestController
public class CarController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(CarController.class);

	
	 @Autowired        
	 private CarRepository repository;
	 
	@RequestMapping("/cars")        
	public Iterable<Car> getCars() {  
		List<Car> carList = repository.findByBrand1("Ford");
		System.out.println();
		System.out.println(carList);
		System.out.println(carList.size());
		
	    logger.info("\n\n\n\n\n");	
	    logger.error(carList.get(0).getBrand());	


		
        return repository.findAll();
	}
}
