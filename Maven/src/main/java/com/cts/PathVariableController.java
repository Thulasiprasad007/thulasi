package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableController {
	/*
	 * Binding a uri template varaible to a
	 * mthod parameter using 'name' or 'value'
	 * attribute of @PathVariable
	 */
	@RequestMapping("/path2/{name}/{age}")
	public ModelAndView disp(
			@PathVariable("name")String name1,
			@PathVariable("age")int age1
			)
	{
		ModelAndView m1=new ModelAndView();
		m1.addObject("msg","Name:"+name1+"<=============>Age:"+age1);
		m1.setViewName("PathParameter");
		return m1;
	}

}
