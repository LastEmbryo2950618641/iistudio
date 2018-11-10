package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.User;


/**
 * @ClassName:DoEnterToMainController
 * @Description:Controller，拦截到达主界面的url
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
public class DoEnterToMainController {
	//当前用户
     @Autowired
     User user;
     
     /**
      * @Title: /
      * @Description:拦截到."/"的url，并跳转到/index.jsp
      * @param
      * @return:String
      * @throws
      */
	 @RequestMapping("/")
	    public String indexPage(){
	     
	        return "index";
	        
	    }
	 
	  
     /**
      * @Title: /main.asp
      * @Description:拦截到.“/main.asp”的url，发送当前用户信息(user)并跳转到/main/main.jsp
      * @param
      * @return:ModelAndView
      * @throws
      */
	 @RequestMapping("/main.asp")
	 public ModelAndView indexToMain() {
		  
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.addObject("user", user);
		 modelAndView.setViewName("main/main");
		 return modelAndView; 
	 }
}
