package cn.com.iistudio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	//��ת����¼����
		@RequestMapping("loginAccount.asp")
		public ModelAndView toRegisterPage()
		{
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("main/loginpage");
			
			return modelAndView;
		}

}
