package com.ust.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employees")
public class Springexample2Controller {

	
	
	@RequestMapping("/employ")
	public Employees getColors(Model model)
	
	{
		List<Emp> employees = new ArrayList<>();
		Emp c1 = new Emp();
		
		c1.setFirstName("Jossy");
		c1.setLastName("Jose");
		c1.setEmail("jossy@gmail.com");
		Emp c2 = new Emp();
		c2.setFirstName("Abhinaya");
		c2.setLastName("vishakhan");
		c2.setEmail("abhi@gmail.com");
		Emp c3 = new Emp();
		c3.setFirstName("sanju");
		c3.setLastName("k");
		c3.setEmail("sk@gmail.com");
		Emp c4 = new Emp();
		c4.setFirstName("Giri");
		c4.setLastName("kumar");
		c4.setEmail("kumar@gmail.com");
		Emp c5 = new Emp();
		c5.setFirstName("deepu");
		c5.setLastName("benny");
		c5.setEmail("deepu123@gmail.com");
		
		
		employees.add(c1); employees.add(c2);employees.add(c3);employees.add(c4);employees.add(c5);
		
		Employees colorlist=new Employees(employees);
		
		return colorlist;
		
		
		
		
		
	}
	
/*@GetMapping("/newempform")
public String showemployeeform(Model model) {
	Emp employee=new Emp();
	model.addAttribute("employee",employee);
	return "newempform";
}
@PostMapping("/save")
public String saveemployee(@ModelAttribute ("employee") Emp employee) {
empservice.saveemployee(employee);
return "redirect:/";
}
@GetMapping("/showFormForUpdate/{id}")
public String showform(@PathVariable (value="id") String id,Model model) {
	Emp employee=empservice.getEmployeeById(id);
	model.addAttribute("employee", employee);
	return "updateform";
	
}
@GetMapping("/deleteEmployee/{id}")
public String deleteform(@PathVariable (value="id") String id) {
	this.empservice.deleteEmployeeById(id);
	
	return "redirect:/";
}
*/
}
