package com.gayatri.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gayatri.hiring.model.Billing;
import com.gayatri.hiring.repository.BillingRepository;

@Controller
public class BillingController {
	
	@Autowired
	private BillingRepository bill_repo;
	
	@RequestMapping("billing")
	public ModelAndView billing_Info(Model model) {
		ModelAndView modelAndView = new ModelAndView("/billing");
		Billing billing = new Billing();
		modelAndView.addObject("billingDetails", billing);	
		return modelAndView;
	}
	
	
	@PostMapping("/bill_vehicle")
	public String billVehicle(@ModelAttribute("billingDetails") Billing billing) {
		
		bill_repo.save(billing);
		return"booked";
		
	}
}
