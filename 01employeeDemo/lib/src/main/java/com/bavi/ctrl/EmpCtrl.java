package com.bavi.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bavi.model.EmployeeDTO;
import com.bavi.service.IEmployeeService;

@RestController 
@RequestMapping(value="/empCtrl")
public class EmpCtrl {
	
	
	@Autowired
    private IEmployeeService iEmployeeService;
 
    @PostMapping(value= "/save")
    public ResponseEntity<Integer> create(@RequestBody EmployeeDTO employeeDTO) {
        int id = iEmployeeService.createEmployee(employeeDTO);
        if(id != 0)
            return new ResponseEntity<Integer>(id,HttpStatus.CREATED);        
            return new ResponseEntity<Integer>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    //http://localhost:9090/studentMarks/student/result/111
    @GetMapping(value= "/get/{empId}")
    public ResponseEntity<EmployeeDTO> getResultById(@PathVariable("empId") int id) {
    	EmployeeDTO result = new EmployeeDTO(); 
    	System.out.println(" inside get  method STUDENT-SB-HIBERNATE SERICE--3 ");
    	result= iEmployeeService.getEmployee(id);
        	if(result==null)
          return new ResponseEntity<EmployeeDTO>(HttpStatus.NOT_FOUND);
          return new ResponseEntity<EmployeeDTO>(result, HttpStatus.OK);
    }

}
