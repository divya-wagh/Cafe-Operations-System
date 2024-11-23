package com.cafe.cupofjoy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cafe.cupofjoy.models.Customers;
import com.cafe.cupofjoy.models.Sales;
import com.cafe.cupofjoy.services.SalesRepository;

@Controller
@RequestMapping("/sales")
public class SalesController {
	@Autowired
	private SalesRepository repo;
	//show sales record
	@GetMapping({"","/"})
	public String showSalesList(Model model) {
		List<Sales> sales = repo.findAll();
		model.addAttribute("sales",sales);
		return "sales/index";
	}
}
