package cn.com.iistudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName:LoginController
 * @Description:Controller�������¼����
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	  
    /**
     * @Title: /login/loginAccount.asp
     * @Description:���ص��/login/loginAccount.asp����url����ת��main/loginpage.jsp
     * @param
     * @return:ModelAndView
     * @throws
     */
	
	
		@RequestMapping("loginAccount.asp")
		public ModelAndView toRegisterPage()
		{
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("main/loginpage");
			
			return modelAndView;
		}

}
