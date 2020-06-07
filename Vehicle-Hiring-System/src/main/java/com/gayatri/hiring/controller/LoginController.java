package com.gayatri.hiring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.gayatri.hiring.model.Customer;
import com.gayatri.hiring.repository.CustomerRepository;

@Controller
@SessionAttributes("customer")
public class LoginController {

	@Autowired
	private CustomerRepository customer_repo;

	@ModelAttribute("customer")
	public Customer setUpCustomerSession() {
		return new Customer();
	}
	
	@RequestMapping("/login")
	public String register() {
		return"login";
	}

	@PostMapping("/login_validate")
	public String loginValidate(@ModelAttribute("customer") Customer customer, Model model) {
		String cname = customer.getName();
		String cpass = customer.getPassword();
		if (cname.equalsIgnoreCase("ADMIN")&& cpass.equalsIgnoreCase("ADMIN")) {
			return"redirect:/admin_menu";
			
		}
		else {
		List<Customer> customerList = customer_repo.findUser(cname, cpass);
		if (customerList.isEmpty()) {
			System.out.println("couldnt log-in customer");
			model.addAttribute("message", "Login failed. Try again.");
			return "login";

		} else {
			System.out.println("Printing the customer");
			System.out.println(customerList);
			Customer c_user = customerList.get(0);
			System.out.println("Printing the user"+c_user);
			customer.setAddress(c_user.getAddress());
			customer.setContact_no(c_user.getContact_no());
			customer.setCustomer_id(c_user.getCustomer_id());
			customer.setEmail(c_user.getEmail());
			customer.setName(cname);
			return"redirect:/vehicle_list";
		}
		}
		
	}
	
}
