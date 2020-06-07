package com.gayatri.hiring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vehicle_id;
	@Column
	@NonNull
	private String vehicle_name;
	@Column
	@NonNull
	private String type;
	@Column(unique = true)
	@NonNull
	private String license_no;
	@Column
	@NonNull
	private int fare;
	@Column
	@NonNull
	private String status;
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Vehicle(int vehicle_id, String vehicle_name, String type, String license_no, int fare, String status) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_name = vehicle_name;
		this.type = type;
		this.license_no = license_no;
		this.fare = fare;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_name=" + vehicle_name + ", type=" + type
				+ ", license_no=" + license_no + ", fare=" + fare + ", status=" + status + "]";
	}
	public Vehicle() {
		super();
	}
	

	
	

}
