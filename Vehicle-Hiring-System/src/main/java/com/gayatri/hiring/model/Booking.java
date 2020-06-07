package com.gayatri.hiring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;

	@Column
	@NonNull
	private String pickup;

	@Column
	@NonNull
	private String droploc;

	@Column
	@NonNull
	private int distance;
	
	@Column
	@NonNull
	private int fare;

	@Column
	@NonNull
	private String vehicle_id;
	
	@Column
	@NonNull
	private String vehicle_name;
	
	@Column
	@NonNull
    private int customer_id;	
	
	@Column
	@NonNull
    private String customer_name;
	
	@Column
	@NonNull
    private int total_fare;	

	

	public Booking(String pickup, String droploc, int distance, int fare, String vehicle_id, String vehicle_name,
			int customer_id, String customer_name, int total_fare) {
		super();
		this.pickup = pickup;
		this.droploc = droploc;
		this.distance = distance;
		this.fare = fare;
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.total_fare = total_fare;
	}

	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", pickup=" + pickup + ", droploc=" + droploc + ", distance="
				+ distance + ", fare=" + fare + ", vehicle_id=" + vehicle_id + ", vehicle_name=" + vehicle_name
				+ ", customer_id=" + customer_id + ", customer_name=" + customer_name + ", total_fare=" + total_fare
				+ "]";
	}

	public Booking(int booking_id, String pickup, String droploc, int distance, int fare, String vehicle_id,
			String vehicle_name, int customer_id, String customer_name, int total_fare) {
		super();
		this.booking_id = booking_id;
		this.pickup = pickup;
		this.droploc = droploc;
		this.distance = distance;
		this.fare = fare;
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.total_fare = total_fare;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getTotal_fare() {
		return total_fare;
	}

	public void setTotal_fare(int total_fare) {
		this.total_fare = total_fare;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getPickup() {
		return pickup;
	}

	public void setPickup(String pickup) {
		this.pickup = pickup;
	}

	public String getDroploc() {
		return droploc;
	}

	public void setDroploc(String droploc) {
		this.droploc = droploc;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}


	public Booking() {
		super();
	}

	
	
	
	
}
