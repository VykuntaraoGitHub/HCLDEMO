package com.bavi.service;

import com.bavi.model.EmployeeDTO;

public interface IEmployeeService {
	public EmployeeDTO getEmployee(int empId);
	public int createEmployee(EmployeeDTO emp);
	
	

}
