package com.cts.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.springmvc.entity.Admin;
//import com.cts.EmployeeBean;
import com.cts.springmvc.entity.Employee;
import com.cts.springmvc.service.impl.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService1;
	
	

	@RequestMapping("callproj")
	
	public String Home()
	{	
		//employee attribute==modelattribute in register.jsp
		//m.addAttribute("employee",new Employee());
		return "Home";//register.jsp==form action=register
	}
	
	@RequestMapping("Home1")
	public String createUser1(Model m) 
	{	
		//employee attribute==modelattribute in register.jsp
		m.addAttribute("employee",new Employee());
		return "register";//register.jsp==form action=register
	}
	//insertion
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String createUser(@ModelAttribute Employee employee1,Model m)
	{
		employeeService1.createEmployee(employee1);//save(employee)
		 return "redirect:/view1"; //redirect to request pattern::view
	       }
	//selection
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@ModelAttribute Employee employee1,Model m)
	{
		List<Employee> obj=employeeService1.getemps();
		m.addAttribute("emps",obj);//emps can beaccessin ViewEmp.jsp
			return "ViewEmp";//ViewEmp.jsp
	}
	//deletion
    @RequestMapping(value="/deleteemps/{delno}",method = RequestMethod.GET)    
    public String delemp(@PathVariable int delno)
    {    
        employeeService1.deleteemps(delno);;
        return "redirect:/view"; //call req pattern /view
    } 
     
    
    @RequestMapping("updat")
	public String update(Model m) 
	{	
		//employee attribute==modelattribute in register.jsp
		m.addAttribute("update1",new Employee());
		return "update";//register.jsp==form action=register
	}
    @RequestMapping(value="/update/{username,name}",method = RequestMethod.POST)    
    public String update(@PathVariable String username,String name)
    {    
        employeeService1.Update(username, name);
        return "redirect:/view"; //call req pattern /view
    } 
    
    
    
    
    
    @RequestMapping(value = "view1", method = RequestMethod.GET)
	public String view1(@ModelAttribute Employee employee1,Model m)
	{
		List<Employee> obj=employeeService1.getemps();
		m.addAttribute("emps",obj);//emps can beaccessin ViewEmp.jsp
			return "ViewEmp1";//ViewEmp.jsp
	}
    

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute Admin admin) {
		return new ModelAndView("login");//login.jsp
	}


	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute Admin admin) 
	{
		boolean emp = employeeService1.checkLogin(admin.getAusername(),admin.getApassword());
		ModelAndView model = null;
		if (emp) 
		{
			model = new ModelAndView("loginsuccess");//loginsuccess.jsp
			model.addObject("emp", admin.getAusername());//access in jsp
			
		} else {
			model = new ModelAndView("login");//login.jsp
			model.addObject("result", "Invalid Username or Password!!");
		}
		return model;
	}

        

}
