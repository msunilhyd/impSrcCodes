package com.javatechie.jpa.repository;

import com.javatechie.jpa.dto.OrderResponse;
import com.javatechie.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
   
   @Query("SELECT new com.javatechie.jpa.dto.OrderResponse(c.name , p.productName) FROM Customer c INNER JOIN Product p ON c.id=p.qty and p.productName=:productName")
   public List<OrderResponse> getJoinInformation2(String productName);
}
