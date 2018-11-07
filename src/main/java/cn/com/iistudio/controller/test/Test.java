package cn.com.iistudio.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.Privilege;
import cn.com.iistudio.service.serviceinter.TestServiceInter;

@Controller
@RequestMapping("/test")
public class Test {
	
	
	@Autowired
	TestServiceInter testServiceIpml;
	


	

	@RequestMapping("/test.do")
	public ModelAndView test()
	{
		
	 	List<Privilege> list = testServiceIpml.getAll();
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("list", list);
		modelAndView.setViewName("main");
		return modelAndView;
		
	}

}
