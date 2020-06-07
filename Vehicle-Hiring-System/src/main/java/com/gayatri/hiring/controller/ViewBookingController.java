package com.gayatri.hiring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.gayatri.hiring.model.Booking;
import com.gayatri.hiring.model.Customer;
import com.gayatri.hiring.repository.BookingRepository;

@Controller
public class ViewBookingController {
	@Autowired
	BookingRepository book_repo ;
	
	@RequestMapping("view_bookings")
	public ModelAndView view_ALL_Bookings(@SessionAttribute("customer")Customer customer) {

			ModelAndView modelAndView = new ModelAndView("/view_bookings");
			int id =customer.getCustomer_id();
			List<Booking> bookingList = book_repo.findAllCustBooking(id);
			System.out.println(bookingList);
			modelAndView.addObject("bookingList", bookingList);
			return modelAndView;
		

	}
}
