package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.Code;
import cn.com.iistudio.entity.InvitationCode;
import cn.com.iistudio.entity.SecurityCode;
import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.RegisterInter;


/**
 * @ClassName:RegisterController
 * @Description:Controller，处理注册操作
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
@RequestMapping("/resgiter")
public class RegisterController {
	
	@Autowired
	User user;
	@Autowired
	RegisterInter registerIpml;
	

	/**
     * @Title:/resgiter/doResgiter
     * @Description:拦截到."/resgiter/doResgiter"的url，执行此映射下的方法
     * @param:upUser
     * @return:boolean
     * @throws
     */
	@ResponseBody
	@RequestMapping("doResgiter")
	public boolean registerAccount(@RequestBody UpUser upUser) {
		
		System.out.println("test:password:"+user.getPassword()+"\n");
		
		if(registerIpml.doRegisterAccounct(upUser))
		  {
			return true;
		  
		  }
		else {
			return false;
		}
		
	}
	
	/**
     * @Title:/resgiter/upImage
     * @Description:拦截到."/resgiter/upImage"的url，执行此映射下的方法,调用sevice方法处理图片
     * @param:upImage
     * @return:boolean
     * @throws
     */
	    @ResponseBody
		@RequestMapping("upImage")
		public boolean registerAccount(@RequestBody UpImage upImage) {
			  
			 if(registerIpml.doRegisterUpImage(upImage))
			 {
				 return true;
			 }
			 else
			 {
				 return false;
			 }
			
			
		}
	    /**
	     * @Title:/resgiter/doResgiter
	     * @Description:拦截到."/resgiter/Invitation"的url，执行此映射下的方法
	     * @param:Invitation
	     * @return:boolean
	     * @throws
	     */
	        @ResponseBody
	 		@RequestMapping("Invitation")
	 		public boolean  invitation(@RequestBody InvitationCode code) {
	        	System.out.println(code.getInvitationCode());
	        	if(code.getInvitationCode().equals("888888")) {
	    		return true;
	    	}else {
				return false;
	 			  
	    	}	
	 		}
	        /**
	         * @Title:/resgiter/doResgiter
	         * @Description:拦截到."/resgiter/Verification"的url，执行此映射下的方法
	         * @param:Verification
	         * @return:boolean
	         * @throws
	         */
	        @ResponseBody
	 		@RequestMapping("Verification")
	 		public boolean  Verification(@RequestBody SecurityCode code) {
	        	System.out.println(code.getSecurityCode());
	        	System.out.println("you are 666");
	    	if(code.getSecurityCode().equals("888888")) {
	    		System.out.println("you are 666");
	    		return true;
	    	}else {
				return false;
	 			  
	    	}	
	 		}
	    
		/**
	     * @Title:/resgiter/Validation
	     * @Description:拦截到."/resgiter/Validation"的url，执行此映射下的方法,调用sevice方法处理安全码
	     * @param:upImage
	     * @return:boolean
	     * @throws
	     */
	    @ResponseBody
		@RequestMapping("Validation")
		public boolean Validation(@RequestBody SecurityCode securityCode) {
			  
	    	
		if("888888".equals(securityCode.getSecurityCode()))
		{
			return true;
		}
		else
		{
			return false;
		}
			
		}
		
		
		
	//跳转到注册界面
	@RequestMapping("resgiterAccount.asp")
	public ModelAndView toRegisterPage()
	{
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("main/registerpage");
		
		return modelAndView;
	}
	
	
    
	@RequestMapping("upImage.asp")
	public ModelAndView toRegisterUpHeadImage()
	{
		
		System.out.println("test2 username:"+user.getUserName()+"\n");
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("main/registerpage2");
		return modelAndView;
	}
	
	/**
	 * @Description:Controller，跳转到登录界面
	 * @return
	 */
		@RequestMapping("loginAccount.asp")
		public ModelAndView toLoginPage()
		{
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("main/loginpage");
			
			return modelAndView;
		}
		
}
