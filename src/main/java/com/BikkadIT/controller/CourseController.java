package com.BikkadIT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {
	@GetMapping("/course")
	public ModelAndView coursedata(@RequestParam String cname, @RequestParam String tname) {
		String str = "hello guys " + cname + "started from 1 sep 2023 by " + tname;
		System.out.println(str);
		ModelAndView mav = new ModelAndView();
		mav.addObject("COURSE", str);
		mav.setViewName("course");
		return mav;

	}

}
