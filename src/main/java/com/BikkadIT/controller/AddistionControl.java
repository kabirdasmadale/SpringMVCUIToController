package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AddistionControl {
	@GetMapping("/addistion/{a}/{b}")
	public String Add (@PathVariable int a,@PathVariable int b,Model model) {
		int c=a+b;
		String str="the addistion of a and b is :"+c;
		System.out.println("the addistion of a and b is :"+c);
		model.addAttribute("ADD", str);
		return "ADDISTION";
		
	}

}
