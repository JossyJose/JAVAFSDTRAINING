package com.ust.springboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class SpringController {

@Autowired
private EmpRespository empRepository;
//findall
@GetMapping("/employees")
public List<Emp> getAllemployees() {
	return empRepository.findAll();
}

//find by id
@GetMapping("/employees/{id}")
public ResponseEntity<Emp> getEmpById(@PathVariable(value = "id") String id)
		throws ResourceNotFoundException {
	Emp Emp = empRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
	return ResponseEntity.ok(Emp);
}
//add
@PostMapping("/employees")
public Emp createEmp( @RequestBody Emp Emp) {
	return empRepository.save(Emp);
}

//update
@PutMapping("/employees/{id}")
public ResponseEntity<Emp> updateEmp(@PathVariable(value = "id") String id,
		 @RequestBody Emp EmpDetails) throws ResourceNotFoundException {
	Emp Emp = empRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Emp not found for this id :: " + id));

	
	Emp.setLastName(EmpDetails.getLastName());
	Emp.setFirstName(EmpDetails.getFirstName());
	Emp.setEmail(EmpDetails.getEmail());
  Emp updatedEmp = empRepository.save(Emp);
	return ResponseEntity.ok(updatedEmp);
}

//delete
@DeleteMapping("/employees/{id}")
public ResponseEntity<Map<String, Boolean>> deleteEmp(@PathVariable String id) throws ResourceNotFoundException {
	Emp Emp = empRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Emp not found for this id :: " + id));

     empRepository.delete(Emp);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return ResponseEntity.ok(response);
}
	
}
