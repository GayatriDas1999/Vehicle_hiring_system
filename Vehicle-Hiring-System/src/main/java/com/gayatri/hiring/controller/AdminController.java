package com.gayatri.hiring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.gayatri.hiring.model.Booking;
import com.gayatri.hiring.model.Customer;
import com.gayatri.hiring.model.Vehicle;
import com.gayatri.hiring.repository.BookingRepository;
import com.gayatri.hiring.repository.CustomerRepository;
import com.gayatri.hiring.repository.VehicleRepository;

@Controller

public class AdminController {
	
	@Autowired
	CustomerRepository cust_repo;

	
	@Autowired
	VehicleRepository vehicle_repo;
	
	@Autowired
	BookingRepository book_repo;
	
	@RequestMapping("/admin_menu")
	public String showAdminMenu() {
		return"admin_menu";
	}
	
	@RequestMapping("/viewCustomer")
	public ModelAndView getAllCustomers() {
		
		ModelAndView mv = new ModelAndView("/view_customer");
		List<Customer> customerList = cust_repo.findAll();
		mv.addObject("customerList", customerList);
		return mv;
		
	}
	
	@RequestMapping("/update_vehicle")
	public ModelAndView updateVehicleInfo() {
		ModelAndView mv = new ModelAndView("/update_vehicle");
		List<Vehicle> vehicleList = vehicle_repo.findAll();
		mv.addObject("vehicleList", vehicleList);
		return mv;
	}
		
	@RequestMapping("/delete_vehicle/{license_no}")
	public String deleteVehicle(@ModelAttribute("vehicle")Vehicle vehicle,@PathVariable("license_no") String license_no) {

		List<Vehicle> vehiclelist = vehicle_repo.findByLicenseNo(license_no);
		System.out.println(vehiclelist);
		Vehicle c_vehicle = vehiclelist.get(0);
		vehicle_repo.delete(c_vehicle);
		return "redirect:/update_vehicle";
		
	}
	@RequestMapping("/update_vehicle/{license_no}")
	public ModelAndView updateVehicle(@PathVariable("license_no") String license_no) {

		ModelAndView mv = new ModelAndView("/add_vehicle");
		List<Vehicle> vehiclelist = vehicle_repo.findByLicenseNo(license_no);
		Vehicle c_vehicle = vehiclelist.get(0);
		mv.addObject("vehicleDetails",c_vehicle);
		return mv;
	}
	@RequestMapping("/add_vehicle")
	public ModelAndView addVehicle() {
		ModelAndView modelAndView = new ModelAndView("/add_vehicle");
		Vehicle vehicle = new Vehicle();
		modelAndView.addObject("vehicleDetails", vehicle);
		return modelAndView;
	}
	
	@RequestMapping("/insert_vehicle")
	public String insertVehicle(@ModelAttribute("vehicleDetails") Vehicle vehicle) {
		
		vehicle_repo.save(vehicle);
		return"redirect:/update_vehicle";
		
	}
	
	@RequestMapping("/bookings")
	public ModelAndView view_ALL_Bookings() {

		ModelAndView modelAndView = new ModelAndView("/bookings");
		List<Booking> bookingList = book_repo.findAll();
		System.out.println(bookingList);
		modelAndView.addObject("bookingList", bookingList);
		return modelAndView;
	

}
}
