package com.gayatri.hiring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name="billing")
public class Billing {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billing_id;
	
	@Column
	@NonNull
	private int booking_id;
	
	@Column
	@NonNull
	private int amount;

	public int getBilling_id() {
		return billing_id;
	}

	public void setBilling_id(int billing_id) {
		this.billing_id = billing_id;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Billing(int billing_id, int booking_id, int amount) {
		super();
		this.billing_id = billing_id;
		this.booking_id = booking_id;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Billing [billing_id=" + billing_id + ", booking_id=" + booking_id + ", amount=" + amount + "]";
	}

	public Billing() {
		super();
	}

	
}
