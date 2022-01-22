package com.projectreactor.webflux.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Table("Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {
	
    @Id
    @Column("Emp_id")
	public Integer employeeId;
	
    @Column("Emp_name")
	public String employeeName;
    
    @Column("Emp_age")
	public Integer employeeAge;
    
	@Column("Emp_Address")
	public String empAddress;
	
	@Column("Emp_Salary")
	public long empSalary;
	

}
