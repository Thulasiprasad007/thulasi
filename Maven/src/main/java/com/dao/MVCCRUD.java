package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.EmployeeBean;

//@Configuration
//@ComponentScan(basePackages={"com.cts","com.controller"}}
@Controller
public class MVCCRUD {
       //automatic dependency injection--without xml
	@Autowired
	EmpJDBCController dao2;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(EmployeeBean emp)
	{
		dao2.save1(emp);
		return "redirect:/viewemps";//will redirect to viewemps request mapping
	}
	@RequestMapping("/viewemps")
	public String viewemp(Model m)
	{
		List<EmployeeBean> list=dao2.getEmployees();
		m.addAttribute("emplist",list);
		return "viewemps";
	}
}
