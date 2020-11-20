package com.tcs.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	//@GetMapping("/") // both mappings are equivalent, but use the one below
	@RequestMapping(path = {"/"}, method = RequestMethod.GET)
	public String getHomePage() {
		// TODO Auto-generated method stub
		return "home";

	}
	

}
