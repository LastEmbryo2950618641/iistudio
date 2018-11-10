package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

<<<<<<< HEAD
import cn.com.iistudio.entity.Code;


import cn.com.iistudio.entity.User;

import cn.com.iistudio.entity.VlaUser;
import cn.com.iistudio.service.serviceinter.CheckInter;
import cn.com.iistudio.service.serviceinter.LoginServiceInter;


/**
 * @ClassName:LoginController
 * @Description:对于登录做出控制
 * @author:chengxiang
 * @date:2018年11月9日
 * @version 1.0
=======
/**
 * @ClassName:LoginController
 * @Description:Controller，处理登录操作
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
>>>>>>> b360b0c67f8c66d105d9075538743464c192aca2
 */
@Controller
@RequestMapping("/login")
public class LoginController {
	
<<<<<<< HEAD
	@Autowired
	LoginServiceInter loginServiceInter;
	@Autowired
	CheckInter CheckInter;
	
	
	
	//跳转到登录界面
=======
	  
    /**
     * @Title: /login/loginAccount.asp
     * @Description:拦截到达“/login/loginAccount.asp”的url，跳转到main/loginpage.jsp
     * @param
     * @return:ModelAndView
     * @throws
     */
	
	
>>>>>>> b360b0c67f8c66d105d9075538743464c192aca2
		@RequestMapping("loginAccount.asp")
		public ModelAndView toRegisterPage()
		{
			
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("main/loginpage");
			return modelAndView;
		}
		/**
		 * @Title:loginAccount.asp
		 * @description:对于验证码进行判断
		 * @param code
		 * @return boolean
		 * 
		 */
		
		@RequestMapping("login.code")
		@ResponseBody
		public boolean toCheck(@RequestBody Code code) {
			System.out.println(code.getSecuritycode());
			
			if("8888".equals(code.getSecuritycode()))
			{
		        return true;
			}
			else
			{
				return false;
			}
			
		}
		
		/**
		 * @Title:loginCheck.php
		 * @description:对于用户登录信息判断
		 * @param vlaUser
		 * @return boolean
		 * 
		 */
		@ResponseBody
		@RequestMapping(value="loginCheck.php")
		public boolean tocheckPage(@RequestBody VlaUser vlaUser  ) {
			String UserName=vlaUser.getUsername();
			String password=vlaUser.getPassword();
			User user=new User();
			if(loginServiceInter.getlLogin(UserName, password)==true) {
				    user=loginServiceInter.getUserinformation(UserName);
				    System.out.println(user.getEmail());
				    System.out.println(user.getGender());
				    System.out.println(user.getIntroduce());
					return true;
				
			}else {
			
			System.out.println("false");
			return false;
			}	
			
		}

}
