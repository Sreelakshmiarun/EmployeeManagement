package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.RegisterEmpService;
import com.example.modelClass.RegisterEmp;

@RestController
public class RegisterEmpCtrl {
	
	@Autowired
	RegisterEmpService empService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@PostMapping("/saveRegEmp")
	public RegisterEmp saveRegEmp(@RequestBody RegisterEmp emp) {
		empService.saveRegEmp(emp);
		return emp;
	}
	
	@GetMapping("/getRegEmp")
	public List<RegisterEmp> getRegEmp() {
		return empService.getRegEmp();
	}
}
