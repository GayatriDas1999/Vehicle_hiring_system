package com.gayatri.hiring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.gayatri.hiring.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
  
	@Query("from Customer where name=?1 and password=?2")
	List<Customer> findUser(String name, String password);
	
	@Query("from Customer where customer_id=?1")
	Customer findCustomer(int customer_id);
	

}
