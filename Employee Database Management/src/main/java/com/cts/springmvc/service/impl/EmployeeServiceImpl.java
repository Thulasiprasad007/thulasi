package com.cts.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.springmvc.dao.impl.EmployeeDAOImpl;
import com.cts.springmvc.entity.Employee;

//SERVICE IS THE MIDDLE LAYER
@Service//get from @repository and connects to @controller
@Transactional//database transaction
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDAOImpl employeeDAO1;
	
	public void createEmployee(Employee employee) 
	{
	
		
		employeeDAO1.createEmployee(employee);
			
	
		
	}
	
	@Transactional
	public List<Employee> getemps() 
	{
		
		return employeeDAO1.getEmployee();
	}

	@Transactional
	public void deleteemps(long theId)
	{
		employeeDAO1.deleteEmp(theId);
	}
	
	@Transactional
	public void Update(String username,String name)
	{
		employeeDAO1.update(username, name);
	}
	
	 //call controller
    public boolean checkLogin(String userName, String userPassword){
        System.out.println("In Service class...Check Login");
        return employeeDAO1.checkLogin(userName, userPassword);
 }
/*
    @Override
    public Employee getEmployee(Employee employee) {
        //
        //
        //
        return employeeDAO1.getEmployee(employee);
    }
    
    */


}
