package com.bavi.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bavi.dao.IEmployeeDAO;
import com.bavi.entity.Employee;
import com.bavi.model.EmployeeDTO;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {
   
	@Autowired
	IEmployeeDAO iEmployeeDAO;
	EmployeeDTO empDTO=null;
	ModelMapper mp=null;
	@Override
	public EmployeeDTO getEmployee(int empId) {
		Employee emp= iEmployeeDAO.getEmployee(empId);
		mp=new ModelMapper();
		empDTO=new EmployeeDTO();
		empDTO=mp.map(emp, EmployeeDTO.class);
		return empDTO;
	}

	@Override
	public int createEmployee(EmployeeDTO emp) {
		return 0;
	}
	
}
