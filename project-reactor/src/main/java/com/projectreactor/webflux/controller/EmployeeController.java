package com.projectreactor.webflux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectreactor.webflux.entity.EmployeeEntity;
import com.projectreactor.webflux.service.EmployeeService;

@RestController
public class EmployeeController {
	
  @Autowired
  EmployeeService employeeService;
	
  @GetMapping("EmployeeDetails")
  public List<EmployeeEntity> getEmployeeDetails(){
	  return employeeService.getEmployeeDetails();
  }

}
