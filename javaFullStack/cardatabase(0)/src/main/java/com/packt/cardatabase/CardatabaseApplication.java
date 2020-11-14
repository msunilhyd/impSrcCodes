package com.packt.cardatabase;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.CarRepository;
import com.packt.cardatabase.domain.Owner;
import com.packt.cardatabase.domain.OwnerRepository;
import com.packt.cardatabase.domain.User;
import com.packt.cardatabase.domain.UserRepository;

@SpringBootApplication
public class CardatabaseApplication {

	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository orepository;
	
	@Autowired
	private UserRepository urepository;
	
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}
	
	@Bean
	CommandLineRunner runner() {
		return args -> {
//			Add owner objects and save these to db
			Owner owner1 = new Owner("John", "Johnson");
			Owner owner2 = new Owner("Mary", "Robinson");
			
			orepository.save(owner1);
			orepository.save(owner2);
			
//			Save demo data to database
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000, owner1));
			repository.save(new Car("Nissan", "Leaf", "White", "SSJ-3002", 2014, 29000, owner2));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000, owner2));
//		 
//			Save some users to database
			urepository.save(new User("user", "$2y$12$Ka8dED76C1GuSocfHJOgdOgPxWPukfqXrxUzk.XABsbTWDW/Y8mMW", "USER"));
			urepository.save(new User("admin", "$2y$12$tjPhExeVM0C9w5PgF1rvpONQ8m24r7O.OTfJlcTXju1S8sAQtHHXi", "ADMIN"));
			urepository.save(new User("sunil", "$2y$12$nakX7xRKCwgjD8GJJmwVCuHyzF4iCzaVnQCMg.9vtUwwIrXSn3DDG", "ADMIN"));
			urepository.save(new User("linus", "$2y$12$tjPhExeVM0C9w5PgF1rvpONQ8m24r7O.OTfJlcTXju1S8sAQtHHXi", "ADMIN"));

		};
	}
}
