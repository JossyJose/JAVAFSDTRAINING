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
	ClinicServices clinicservice;
	@Autowired
	PatientServices patientservice;
	@Autowired
	AppoinmentService appservice;
	@Autowired
	DoctorServices docservice;
	
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
		
		return "redirect:/viewmedicine";
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
	return "redirect:/viewpatients";
		
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
		
		return "redirect:/viewpatients";
	}
	
	//Appointment



	@GetMapping("/bookappointment")
	public String bookappointment(Model model)
	
	{
		Appoinment appointments=new Appoinment();
		model.addAttribute("appointments",appointments);
		return "bookappointment";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute ("appointment") Appoinment appointment)

	{
	appservice.register(appointment);
	return "redirect:/home";
		
	}
	
	@GetMapping("/viewappointment")
	public String viewappointment(Model model)
	{
		model.addAttribute("lisappointment",appservice.getAppointment());
		return "viewappointment";
	}
	//doctor
	
	@GetMapping("/adddoctor")
	public String adddoctor(Model model)
	
	{
		Doctor doctors=new Doctor();
		model.addAttribute("doctors",doctors);
		return "adddoctor";
	}
	@PostMapping("/dsave")
	public String saveDoctor(@ModelAttribute ("doctor") Doctor doctor)

	{
		docservice.saveDoctor(doctor);
		return "adddoctor";
		
	}

	@GetMapping("/docupdateform/{id}")
	public String docupdateform(@PathVariable (value="id") String id, Model model)
	
	{
		Doctor doctor=docservice.getDoctorById(id);
		model.addAttribute("doctor",doctor);
		return "docupdateform";
	}
	@GetMapping("/deletedoctor/{id}")
	public String deletedoctor(@PathVariable (value="id") String id)
	
	{
		this.docservice.deleteDoctorById(id);
		
		return "redirect:/viewdoctor";
	}
	@GetMapping("/viewdoctor")
	public String viewdoctor(Model model)
	{
		model.addAttribute("lisdoctor",docservice.getDoctors());
		return "viewdoctor";
	}
	
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




