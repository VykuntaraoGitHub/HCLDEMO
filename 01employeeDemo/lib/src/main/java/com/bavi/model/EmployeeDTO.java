package com.bavi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*create table employee(empId int, empName varchar2(22), empSalary int);
INSERT INTO employee(empId,empName,empSalary ) VALUES (101,'Vykuntarao',50000);*/
//Model class.
public class EmployeeDTO {
	private int empId;
	private String empName;
	private int empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}
