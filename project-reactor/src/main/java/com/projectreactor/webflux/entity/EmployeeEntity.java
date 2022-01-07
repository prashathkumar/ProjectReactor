package com.projectreactor.webflux.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	
	public EmployeeEntity(int s, String string) {
		this.employeeId=s;
		this.employeeName=string;
	}

	public int employeeId;
	
	public String employeeName;
	

}
