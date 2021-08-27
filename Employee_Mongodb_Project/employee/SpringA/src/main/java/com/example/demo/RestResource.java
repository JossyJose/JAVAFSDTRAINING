package com.example.demo;

import java.util.ArrayList;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/employees")
public class RestResource {

	
	@RequestMapping("/employ")
	public Employees getColors()
	
	{
	List<Empp> employees = new ArrayList<>();
	Empp c1 = new Empp();
	c1.setId(1);
	c1.setName("Giri");
	c1.setEmail("giri@gmail.com");
	Empp c2 = new Empp();
	c2.setId(2);
		c2.setName("km");
		c2.setEmail("nomail@gmail.com");
	
		employees.add(c1); employees.add(c2);
		
	Employees colorlist=new Employees(employees);
		
		return colorlist;
		
	}
	
	
	
}
