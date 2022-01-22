package com.projectreactor.webflux.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.stereotype.Service;

import com.projectreactor.webflux.entity.EmployeeEntity;

@Service
public class EmployeeService {

	public List<EmployeeEntity> getEmployeeDetails() {
		// TODO Auto-generated method stub
		return IntStream.range(1, 100).mapToObj(s-> new EmployeeEntity(s,"Employee"+s,28,"hi",56)).collect(Collectors.toList());
	}


}
