package com.cafe.cupofjoy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.cafe.cupofjoy.models.Sales;
import com.cafe.cupofjoy.services.SalesRepository;

@Controller
public class InsertSales {
	@Autowired
	private SalesRepository repos;
	@GetMapping("/addsales")
    public String showForm(Model model) {
		model.addAttribute("sales", new Sales());
        return "addsales";
    }

    @PostMapping("/addsales")
    public String addSale(@ModelAttribute("sales") Sales sale) {
    	 repos.save(sale);
         return "redirect:/addsales";
    }
}
