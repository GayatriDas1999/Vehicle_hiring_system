package com.gayatri.hiring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gayatri.hiring.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	@Query("from Vehicle where license_no=?1")
	List<Vehicle> findByLicenseNo(String license_no);
}
