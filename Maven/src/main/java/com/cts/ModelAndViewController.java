package com.cts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ModelAndViewController {
	@RequestMapping(value="/modview")
	public ModelAndView getdate()
	{
		List<String> list=getList();
		//return back to modelview.jsp
		ModelAndView m=new ModelAndView("modelview");//return view jsp
		m.addObject("lists",list);
		return m;
	}


	private List<String> getList() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("JAVA");
		list.add("Python");
		list.add("Angular");
		list.add("Express FrameWork");
		list.add("Swagger Tool");
		return list;
	}

}
