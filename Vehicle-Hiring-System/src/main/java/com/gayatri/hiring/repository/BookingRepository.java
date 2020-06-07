package com.gayatri.hiring.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.gayatri.hiring.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

	
	@Query(" FROM Booking where customer_id=?1")
	List<Booking>findAllCustBooking(int id);
	
}
