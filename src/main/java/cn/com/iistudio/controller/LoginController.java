package cn.com.iistudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName:LoginController
 * @Description:Controller，处理登录操作
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	  
    /**
     * @Title: /login/loginAccount.asp
     * @Description:拦截到达“/login/loginAccount.asp”的url，跳转到main/loginpage.jsp
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
