package com.packt.cardatabaseThree;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabaseThree.domain.CarRepository;
import com.packt.cardatabaseThree.domain.OwnerRepository;
import com.packt.cardatabaseThree.entity.Car;
import com.packt.cardatabaseThree.entity.Owner;

@SpringBootApplication
public class CardatabaseThreeApplication {

	@Autowired        
	private static CarRepository repository;
	
	@Autowired        
	private OwnerRepository orepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseThreeApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(CardatabaseThreeApplication.class, args);
	    logger.info("Hello Spring Boot");		
//
		

	    
	}
	@Bean        
	CommandLineRunner runner(){          
		return args -> {  
			// Add owner objects and save these to db            
			Owner owner1 = new Owner("John" , "Johnson");            
			Owner owner2 = new Owner("Mary" , "Robinson");            
			orepository.save(owner1);            
			orepository.save(owner2);
			// Save demo data to database            
			repository.save(new Car("Ford", "Mustang", "Red",             "ADF-1121", 2017, 59000, owner1));            
			repository.save(new Car("Nissan", "Leaf", "White",             "SSJ-3002", 2014, 29000, owner2));
			repository.save(new Car("Toyota", "Prius", "Silver",             "KKO-0212", 2018, 39000, owner2));
		};
	}

}
