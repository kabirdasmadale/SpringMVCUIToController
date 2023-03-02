package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcomemsg(@RequestParam String name, Model model) {
		String str=" Hii  "+name+"  Welcome to BikkadIT";
		System.out.println(str);
		model.addAttribute("MSG", str);
		
		return "welcome";
		
	}
	

}
