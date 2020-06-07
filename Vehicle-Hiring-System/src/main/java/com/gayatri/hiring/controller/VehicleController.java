package com.gayatri.hiring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.gayatri.hiring.model.Booking;
import com.gayatri.hiring.model.Customer;
import com.gayatri.hiring.model.Vehicle;
import com.gayatri.hiring.repository.VehicleRepository;

@Controller
@SessionAttributes("vehicle")
public class VehicleController {
	
	@ModelAttribute("vehicle")
	public Vehicle setUpVehicleSession() {
		return new Vehicle();
	}

	@Autowired
	private VehicleRepository vehicle_repo;
	
	@RequestMapping(value = "/vehicle_list",method = RequestMethod.GET)
	public ModelAndView getAllVehicles() {

		ModelAndView modelAndView = new ModelAndView("/vehicle_list");
		List<Vehicle> vehicleList = vehicle_repo.findAll();
		System.out.println(vehicleList);
		modelAndView.addObject("vehicleList", vehicleList);
		return modelAndView;
	}

	@RequestMapping("/select_vehicle/{license_no}")
	public String bookVehicle(@ModelAttribute("vehicle")Vehicle vehicle,@PathVariable("license_no") String license_no) {

		List<Vehicle> vehiclelist = vehicle_repo.findByLicenseNo(license_no);
		Vehicle c_vehicle = vehiclelist.get(0);
		if (c_vehicle.getStatus().equals("Not-Available")) {
			System.out.println("Vehicle is not available");
			//model.addAttribute("message", "Vehicle is unavailable");
			return"redirect:/vehicle_list";
			
		}
		else {
		System.out.println("Changing vehicle Status" +"/n"+ license_no);
		c_vehicle.setStatus("Not-Available");
		System.out.println("Updated vehicle status");
		System.out.println(c_vehicle);
		vehicle_repo.save(c_vehicle);
		vehicle.setVehicle_id(c_vehicle.getVehicle_id());
		vehicle.setLicense_no(license_no);
		vehicle.setType(c_vehicle.getType());
		vehicle.setStatus(c_vehicle.getStatus());
		vehicle.setVehicle_name(c_vehicle.getVehicle_name());
		vehicle.setFare(c_vehicle.getFare());
		

		return "redirect:/booking";}
	}
	
	
	
	
	
	
	

}
