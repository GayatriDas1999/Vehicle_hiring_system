package com.gayatri.hiring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	@Column
	@NonNull
	private String name;
	@Column
	@NonNull
	private int contact_no;
	@Column
	@NonNull
	private String password;
	@Column
	@NonNull
	private String email;
	@Column
	@NonNull
	private String address;
	
	
	public Customer(int customer_id, String name, int contact_no, String password, String email, String address) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.contact_no = contact_no;
		this.password = password;
		this.email = email;
		this.address = address;
		
	}
	
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContact_no() {
		return contact_no;
	}
	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(int customer_id, String name, int contact_no, String password, String email, String mobile_no,
			String address) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.contact_no = contact_no;
		this.password = password;
		this.email = email;
		this.address = address;
	}
	public Customer() {}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", contact_no=" + contact_no + ", password="
				+ password + ", email=" + email + ", address=" + address + "]";
	}
	public Customer(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	};
	
	
	
	
}
