package com.bavi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bavi.entity.Employee;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {
	@Autowired
    private SessionFactory sf;
	@Override
	public Employee getEmployee(int empId) {
		Employee employee=null;
		Session s = sf.getCurrentSession();
		 s.beginTransaction();
		 employee=s.get(Employee.class, empId);
		 if(employee==null) {
			 System.out.println("================no employee found with given id:"+empId);
		 }
		 System.out.println("in dao:"+employee.getEmpName());
		 s.getTransaction().commit();
		 
		return employee;
	}
	

	@Override
	public int createEmployee(Employee emp) {
		return 0;
	}

}
