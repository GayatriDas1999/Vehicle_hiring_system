package com.gayatri.hiring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	
	@RequestMapping("/")
	public String homePage() {
		return "homepage";
	}

	@RequestMapping("/homepage")
	public String show_homePage() {
		return "homepage";
	}

	

}
