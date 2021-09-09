package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class SpringController {
	
	@Autowired
	DoctorServices docservice;
	
	@Autowired
	AppoinmentService appservice;
	
	@Autowired
	ClinicServices clinicservice;
	@Autowired
	PatientServices patientservice;
	@RequestMapping("/")
	
	public String index() {
		return "index.html";
	}

	
	@RequestMapping("/home")
	public String iindex() {
		return "home.html";
	}
	
	@GetMapping("/viewmedicine")
	public String viewmedicines(Model model)
	{
		model.addAttribute("lisMedicine",clinicservice.getMedicine());
		return "viewmedicine";
	}
	
	@GetMapping("/addmedicine")
	public String addmedicine(Model model)
	
	{
		Med medicine=new Med();
		model.addAttribute("medicine",medicine);
		return "addmedicine";
	}
	
	@PostMapping("/save")
	public String saveMedicine(@ModelAttribute ("medicine") Med medicine)
	
	{
	clinicservice.saveMedicine(medicine);
	return "redirect:/viewmedicine";
		
	}
	
	@GetMapping("/updateform/{id}")
	public String updateform(@PathVariable (value="id") String id, Model model)
	
	{
		Med medicine=clinicservice.getMedicineById(id);
		model.addAttribute("medicine",medicine);
		return "updateform";
	}
	

	@GetMapping("/deleteMedicine/{id}")
	public String deleteform(@PathVariable (value="id") String id)
	
	{
		this.clinicservice.deleteMedicineById(id);
		
		return "redirect:/home";
	}
	
	
	@GetMapping("/viewpatients")
	public String viewpatients(Model model)
	{
		model.addAttribute("lisPatients",patientservice.getPatients());
		return "viewpatients";
	}
	
	@GetMapping("/addpatients")
	public String addpatients(Model model)
	
	{
		Patients patients=new Patients();
		model.addAttribute("patients",patients);
		return "addpatients";
	}
	
	@PostMapping("/saved")
	public String savePatients(@ModelAttribute ("patients") Patients patients)
	
	{
	patientservice.savePatients(patients);
	return "redirect:/home";
		
	}
	
	@GetMapping("/updatepatients/{id}")
	public String updatepatients(@PathVariable (value="id") String id, Model model)
	
	{
		Patients patients=patientservice.getPatientsById(id);
		model.addAttribute("patients",patients);
		return "updatepatients";
	}

	@GetMapping("/deletePatients/{id}")
	public String deletepatients(@PathVariable (value="id") String id)
	
	{
		this.patientservice.deletePatientsById(id);
		
		return "redirect:/home";
	}
	
	
	
	@PostMapping("/register")
	public String register(@ModelAttribute ("appointment") Appoinment appointment)

	{
	appservice.register(appointment);
	return "redirect:/viewappointment";
		
	}

	@GetMapping("bookappointment")
	public String bookappointment(Model model)

	{
		Appoinment appointment=new Appoinment();
		model.addAttribute("appointment",appointment);
		return "bookappointment";
	}

	@GetMapping("/deleteappointment/{id}")
	public String deleteappointment(@PathVariable (value="id") String id)

	{
		this.appservice.deleteAppointmentById(id);
		
		return "redirect:/viewappointment";
	}

	@GetMapping("/viewappointment")
	public String viewapp(Model model)
	{
		model.addAttribute("listappo",appservice.getAppointment());
		return "viewappointment";
	}
	
	
	
	@PostMapping("/dsave")
	public String saveDoctor(@ModelAttribute ("doctor") Doctor doctor)

	{
	docservice.saveDoctor(doctor);
	return "redirect:/viewdoctor.html";
		
	}

	@GetMapping("adddoctor.html")
	public String adddoctor(Model model)

	{
		Doctor doctor=new Doctor();
		model.addAttribute("doctor",doctor);
		return "adddoctor.html";
	}
	@GetMapping("/viewdoctor.html")
	public String viewdoctor(Model model)
	{
		model.addAttribute("listDoctor",docservice.getDoctors());
		return "viewdoctor.html";
	}

	@GetMapping("/docupdateform/{id}")
	public String docupdateform(@PathVariable (value="id") String id, Model model)

	{
		Doctor doctor=docservice.getDoctorById(id);
		model.addAttribute("doctor",doctor);
		return "docupdateform.html";
	}
	@GetMapping("/deletedoctor/{id}")
	public String deletedoctor(@PathVariable (value="id") String id)

	{
		this.docservice.deleteDoctorById(id);
		
		return "redirect:/viewdoctor.html";
	}
	
	
	
	
	@RequestMapping("/employees")
	public ModelAndView home1() {
		ModelAndView model=new ModelAndView("employees");
		
		//ModelAndView m=new ModelAndView("color");
		RestTemplate resttemplate=new RestTemplate();
		
		Employees result=resttemplate.getForObject("http://localhost:8085/employees/employ",Employees.class);
		System.out.println(result);
		//System.out.println(result.getColo());
		model.addObject("employees",result.getEmployees());
	
		return model;
		
		
	}
	
}
