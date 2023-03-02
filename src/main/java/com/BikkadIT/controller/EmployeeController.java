package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	@GetMapping("/employeedata")
	public String employedata(@RequestParam String name,@RequestParam String Vname,Model model) {
		String str=" hello my name is "+name+ " my vilage name is "+Vname;
		System.out.println(str);
		model.addAttribute("EMPLOYEE",str);
	
		
		
		return "Empolyee";
		
	}

}
