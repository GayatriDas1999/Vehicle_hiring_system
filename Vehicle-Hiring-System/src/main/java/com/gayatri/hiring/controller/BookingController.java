package com.gayatri.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gayatri.hiring.model.Booking;
import com.gayatri.hiring.repository.BookingRepository;

@Controller
public class BookingController {

	@Autowired

	private BookingRepository booking_repo;

	@RequestMapping("/booking")
	public ModelAndView booking_Info() {
		ModelAndView modelAndView = new ModelAndView("/booking");
		Booking booking = new Booking();
		modelAndView.addObject("bookingDetails", booking);
		return modelAndView;
	}
	
	

	@PostMapping("/booking_vehicle")
	public String bookVehicle(@ModelAttribute("bookingDetails") Booking booking,Model model,RedirectAttributes redirectAttributes) {
		
		int distance = booking.getDistance();
		int fare = booking.getFare();
		int amount = distance*fare;
		booking.setTotal_fare(amount);
		System.out.println(booking);
		booking_repo.save(booking);
		
		int id = booking.getBooking_id();
		redirectAttributes.addFlashAttribute("amount", amount);
		redirectAttributes.addFlashAttribute("booking_id", id);
		return"redirect:/billing";
	}
	
	 }
	 

