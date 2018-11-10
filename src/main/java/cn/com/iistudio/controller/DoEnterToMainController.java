package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.User;


/**
 * @ClassName:DoEnterToMainController
 * @Description:Controller�����ص����������url
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
public class DoEnterToMainController {
	//��ǰ�û�
     @Autowired
     User user;
     
     /**
      * @Title: /
      * @Description:���ص�."/"��url������ת��/index.jsp
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
      * @Description:���ص�.��/main.asp����url�����͵�ǰ�û���Ϣ(user)����ת��/main/main.jsp
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
