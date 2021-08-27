package com.ust.springboot;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class AController {
	
	
	@RequestMapping("/employees")
	public ModelAndView home1() {
	ModelAndView model=new ModelAndView("employees");
		
		RestTemplate resttemplate=new RestTemplate();
		
		Employees result=resttemplate.getForObject("http://localhost:8085/employees/employ",Employees.class);
		System.out.println(result);

		
	model.addObject("employees",result.getemp());

	return model;
	
		
	}
	
	
	
	}

