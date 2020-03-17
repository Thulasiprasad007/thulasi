package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController1 {
	@RequestMapping(value="/checkaccount",method=RequestMethod.POST)
	//@RequestParam-recives value from jsp
	public String display(
			@RequestParam("user1")
			String username,
			@RequestParam("pass")
			String pass1,
			Model m
			)
	{
		if(username.equals("Thulasi"))
		{
		String msg="Hello"+username;
		m.addAttribute("message",msg);
		return "successpage";//view jsp
		}
		else
		{
			String msg="Sorry! Invalid"+username;
			m.addAttribute("message1",msg);
			return "errorpage";//view jsp
		}
	}
	

}
