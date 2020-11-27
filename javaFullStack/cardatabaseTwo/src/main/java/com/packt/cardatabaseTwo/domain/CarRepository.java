package com.packt.cardatabaseTwo.domain;

import org.springframework.data.repository.CrudRepository;

import com.packt.cardatabaseTwo.entity.Car;

public interface CarRepository extends CrudRepository <Car, Long>{

}
