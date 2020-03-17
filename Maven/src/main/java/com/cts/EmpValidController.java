package com.cts;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpValidController {
	@RequestMapping("/empform")
	public String empForm(Model m){
		m.addAttribute("emp", new EmployeeBean_Valid());
		return "EmpValid";
	}
	
	@RequestMapping("/checkForm")
	public String checkForm(
			@Valid 
			@ModelAttribute("emp") 
			EmployeeBean_Valid e, 
			BindingResult br)
	{
		if(br.hasErrors())
			return "EmpValid";
		else
			return "EmpValidSuccess";
	}
}
