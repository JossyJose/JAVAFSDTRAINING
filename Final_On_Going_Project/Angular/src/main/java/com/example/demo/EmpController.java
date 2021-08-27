package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {
	

	@Autowired
	MongoRepository repo;
	
	@Autowired
	EmpService empservice;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/empform")
	public String empform() {
		return "empform.jsp";
	}
	@RequestMapping("/empedit")
	public String empedit() {
		return "empedit.jsp";
	}
	
	@RequestMapping("/save")
	public String save(Emp emp) {
		repo.save(emp);
		return "view.jsp";
	}
	
	
	/*@GetMapping("/view")  
	public String getAllEmp(HttpServletRequest request) {
		request.setAttribute("empp", empservice.getAllEmp());
		return "view.jsp";
	}
	*/

	 @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	 public String delete(@PathVariable int id){    
		  repo.deleteById(id);    
		  return "redirect:/view";    
	  }
	 @PostMapping("/empedit/{id}" )
	 public String empedit(@PathVariable ( value = "id") int id, Model model) {
		 
		 Emp emp = empservice.getEmpById(id);
			
			// set employee as a model attribute to pre-populate the form
			model.addAttribute("employee", emp);
		
		 
		 return "redirect:/";
	 }
	 
	 
	 @PostMapping("/edit")  
		private String update(@RequestBody Emp emp)   
		{  
		System.out.println("pleaseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		empservice.saveOrUpdate(emp);
		System.out.println("pleaseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		 return "redirect:/view";
		} 
	 
	 /*@PostMapping("/edit")
		public String edit(Emp emp,Integer id) {
			repo.save(emp);
			System.out.println("pleaseeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			  return "redirect:/view";    
		}*/


}
