package com.cafe.cupofjoy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe.cupofjoy.models.Customers;
import com.cafe.cupofjoy.services.CustomerRepository;

@Controller
public class Customernew {
	@Autowired
	private CustomerRepository customerRepository;
	//adds customer record
	@GetMapping("/add-customer")
    public String showForm(Model model) {
		model.addAttribute("customer", new Customers());
        return "add-customer";
    }

    @PostMapping("/add-customer")
    public String addCustomer(@ModelAttribute("customer") Customers customer) {
    	 customerRepository.save(customer);
         return "redirect:/menu2";
    }
}
