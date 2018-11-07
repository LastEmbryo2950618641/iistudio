package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.User;

@Controller
public class DoEnterToMainController {
     @Autowired
     User user;
     
	 @RequestMapping("/")
	    public String indexPage(){
	     
	        return "index";
	        
	    }
	 @RequestMapping("/main.asp")
	 public ModelAndView indexToMain() {
		  
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("user", user);
		 modelAndView.setViewName("main/main");
		 return modelAndView; 
	 }
}
