package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.InvitationCode;
import cn.com.iistudio.entity.SecurityCode;
import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.RegisterInter;


/**
 * @ClassName:RegisterController
 * @Description:Controller������ע������
 * @author:����
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
     * @Description:���ص�."/resgiter/doResgiter"��url��ִ�д�ӳ���µķ���
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
     * @Description:���ص�."/resgiter/upImage"��url��ִ�д�ӳ���µķ���,����sevice��������ͼƬ
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
	     * @Description:���ص�."/resgiter/Invitation"��url��ִ�д�ӳ���µķ���
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
	         * @Description:���ص�."/resgiter/Verification"��url��ִ�д�ӳ���µķ���
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
	     * @Description:���ص�."/resgiter/Validation"��url��ִ�д�ӳ���µķ���,����sevice����������ȫ��
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



	//��ת��ע������
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

		System.out.println("test2 username:"+user.getUsername()+"\n");
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("main/registerpage2");
		return modelAndView;
	}

	/**
	 * @Description:Controller����ת����¼����
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
