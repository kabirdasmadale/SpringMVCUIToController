package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AddistionController {
	@GetMapping("/printValue/{a}/addistionController")
	public String printValue(@PathVariable int a,Model model) {
		String str="the value of a is :"+a;
		System.out.println(a);
		model.addAttribute("value1",str);
		return "add1";

	}
	@GetMapping("/add/{a}/{b}")
	public String add(@PathVariable int a, @PathVariable int b, Model model) {
	int	C=a+b;
		String str1="the addistion  of a and b is :"+C;
		System.out.println(C);
		model.addAttribute("value2",str1);
		return "add2";
		
	}
	}
