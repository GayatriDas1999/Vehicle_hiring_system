package com.gayatri.hiring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gayatri.hiring.model.Billing;

public interface BillingRepository extends JpaRepository<Billing, Integer> {
	

}
