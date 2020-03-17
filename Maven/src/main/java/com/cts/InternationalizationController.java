package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*(i18n)Internationalization:
 * internationalization
 * process of desigining an application that can be
 * adapted to various langauage and regions
 */
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InternationalizationController {

	@RequestMapping(value="/user_i18n")
	public ModelAndView initView()
	{
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("msg","Spring MVC Internalization Example");
		modelview.setViewName("resourcebundleview");//jsp file name
		return modelview;
	}
}
