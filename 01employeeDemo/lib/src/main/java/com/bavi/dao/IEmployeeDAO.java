package com.bavi.dao;

import com.bavi.entity.Employee;

public interface IEmployeeDAO {
	public Employee getEmployee(int empId);
	public int createEmployee(Employee emp);
	
	

}
