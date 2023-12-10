package com.java.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class all_Controller {

	@Autowired
	BookRepository br;
	@Autowired
	ReviewRepository rr;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("books" ,br.findAll() );
		model.addAttribute("reviews",rr.findAll());
		return "index";
	}
	
	@RequestMapping("/addbook")
	public String addbook(Model model) {
		return "addBook";
	}
}
