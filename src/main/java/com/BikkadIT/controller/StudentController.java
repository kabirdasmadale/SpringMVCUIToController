package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@GetMapping("/studentInformation")
	public String student(@RequestParam String Fname,@RequestParam String Lname, Model model) {
		String str=" Hello, my name is "+Fname+" my surname is "+Lname;
		System.out.println(str);
		model.addAttribute("STUDENT",str);
		
		return "SInformation";
		
	}

}
