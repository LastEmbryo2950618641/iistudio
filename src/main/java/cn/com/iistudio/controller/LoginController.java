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
 * @Description:���ڵ�¼��������
 * @author:chengxiang
 * @date:2018��11��9��
 * @version 1.0
/**
 * @ClassName:LoginController
 * @Description:Controller��������¼����
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

=======

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
		/**
		 * @Title:loginAccount.asp
		 * @description:������֤�������ж�
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
		 * @description:�����û���¼��Ϣ�ж�
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
