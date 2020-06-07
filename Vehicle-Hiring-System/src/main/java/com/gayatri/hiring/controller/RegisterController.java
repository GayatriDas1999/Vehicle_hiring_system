package com.gayatri.hiring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gayatri.hiring.model.Customer;
import com.gayatri.hiring.repository.CustomerRepository;

@Controller
public class RegisterController {
	
	@Autowired
	private CustomerRepository customer_repo;

	
	
	@RequestMapping("/register")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView("/register");
		Customer customer = new Customer();
		modelAndView.addObject("customerDetails", customer);
		return modelAndView;
	}

	@PostMapping("/register_customer")
	public String registerCustomer(@ModelAttribute("customerDetails") Customer customer) {
			customer_repo.save(customer);
			System.out.println(customer + "is being saved");
			return "redirect:/login";
		

	}
}
