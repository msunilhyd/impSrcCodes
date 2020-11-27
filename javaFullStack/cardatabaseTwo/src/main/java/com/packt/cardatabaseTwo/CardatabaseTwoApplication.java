package com.packt.cardatabaseTwo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.packt.cardatabaseTwo.domain.CarRepository;
import com.packt.cardatabaseTwo.entity.Car;

@SpringBootApplication
public class CardatabaseTwoApplication {

	@Autowired
	private CarRepository repository;

	private static final Logger logger = LoggerFactory.getLogger(CardatabaseTwoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(CardatabaseTwoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			// Save demo data to database            
			repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2017, 59000));            
			repository.save(new Car("Nissan", "Leaf", "White","SSJ-3002", 2014, 29000));
			repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2018, 39000));
		};
	}
}
