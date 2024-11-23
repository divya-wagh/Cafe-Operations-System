package com.cafe.cupofjoy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe.cupofjoy.models.Customers;
import com.cafe.cupofjoy.services.CustomerRepository;

@Controller
public class AdminController {
	
	@GetMapping({"/home"})
	public String home() {
		return "home";
	}
	@GetMapping({"/about"})
	public String about() {
		return "about";
	}
	@GetMapping({"/contact1"})
	public String contact1() {
		return "contact1";
	}
	@GetMapping({"/menu2"})
	public String menu2() {
		return "menu2";
	}
	@GetMapping({"/cust_info"})
	public String cust_info() {
		return "cust_info";
	}
	@GetMapping({"/menu"})
	public String menu() {
		return "menu";
	}
	@GetMapping({"/calc"})
	public String calc() {
		return "calc";
	}
//	@GetMapping({"/addsales"})
//	public String addsales() {
//		return "addsales";
//	}

}