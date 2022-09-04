package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.RegisterEmpRepo;
import com.example.modelClass.RegisterEmp;

@Service
public class RegisterEmpService {

	@Autowired
	RegisterEmpRepo RegempRepo;
	
	
	
	public RegisterEmp saveRegEmp(RegisterEmp emp) {
		return RegempRepo.save(emp);
	}
	
	public List<RegisterEmp> getRegEmp() {
		return RegempRepo.findAll();
	}
}
