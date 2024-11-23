package com.cafe.cupofjoy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe.cupofjoy.models.*;
import com.cafe.cupofjoy.services.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerRepository repo;
	//showing customer record only
	@GetMapping({"","/"})
	public String showCustomerList(Model model) {
		List<Customers> customers = repo.findAll();
		model.addAttribute("customers",customers);
		return "customers/index";
	}
	

}