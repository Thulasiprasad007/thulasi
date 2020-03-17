package com.cts;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FirstController {
	//similar to @web-servlet
	
	 @RequestMapping("/hdfclogin")
	 public String display1()
	 {
		 //connectiing to view layer
		return "callview";//jsp view file name
		 
	 }
      //send data from controller to view
	 @RequestMapping("/signin")
	 //A model is a map obkect that is used to
	 //store attribute value pairs
	 public String display(Model m)
	 {
		m.addAttribute("myName","Thulasi");
		return "view12";
		 
	 }
	 
	 @RequestMapping("/callpage")
	 public String disp(Model model)
	 {
		 FormBean res=new FormBean();
		 Map<String,String> c1=new HashMap<String,String>();
		 c1.put("US","UnitedStates");
		 c1.put("CH","China");
		 c1.put("SG","Singpore");
		 c1.put("MY", "Malayaisa");
		 //select option values sending to jsp
		 model.addAttribute("countryopt",c1);
		 model.addAttribute("result",res);
		 return "FormLogin";	 
	 }
	 //@ModelAttribute-sending Bean form values to jsp
	 @RequestMapping("/valid")
	 public String submitForm(
			 @ModelAttribute("result12")
			 FormBean res)
	 {
		 return "SuccessForm";
	 }
	 
	
}
