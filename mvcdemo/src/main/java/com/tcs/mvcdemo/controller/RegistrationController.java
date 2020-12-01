package com.tcs.mvcdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.mvcdemo.model.Login;
import com.tcs.mvcdemo.repository.LoginRepository;

@Controller
@RequestMapping(path="/register")
public class RegistrationController {

	@Autowired
	LoginRepository loginRepository;
	@GetMapping("/registration.html")
	public String getLoginPage() {
		return "registration";
	}
	
	@PostMapping("/registration.html")
	public ModelAndView registerUser(@ModelAttribute @Valid Login login, BindingResult result) {
		System.out.println("hello from registration " +login);
		
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			result.getFieldErrors().forEach(e->{
				modelAndView.addObject(e.getField(), e.getDefaultMessage());
				System.out.println(e.getDefaultMessage()+ " "+e.getField());});
					
			modelAndView.setViewName("registration");
			return modelAndView;
		}
		
		if(loginRepository.findById(login.getUserName()).isEmpty()) {
			loginRepository.save(login);
			modelAndView.setViewName("registrationSuccess");
			System.out.println("success");
		}else {
			System.out.println("user already exists");
			modelAndView.setViewName("registrationFail");
		}
		

		return modelAndView;
	}

	
}
