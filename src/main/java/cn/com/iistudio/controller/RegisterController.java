package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.RegisterInter;

@Controller
@RequestMapping("/resgiter")
public class RegisterController {
	
	@Autowired
	User user;
	@Autowired
	RegisterInter registerIpml;
	
	//����ע�ᣬ����ע������
	@ResponseBody
	@RequestMapping("doResgiter")
	public void registerAccount(@RequestBody UpUser upUser) {
		  
		user.setUserName(upUser.getUsername());
		user.setPassword(upUser.getPassword());
		user.setEmail(upUser.getEmail());
		user.setTel(upUser.getTel());
		user.setGender(upUser.getGender());
		
		System.out.println("test:password:"+user.getPassword()+"\n");
		
	}
	
	//����ע�ᣬ�����ϴ���ͼƬ
		@ResponseBody
		@RequestMapping("upImage")
		public void registerAccount(@RequestBody UpImage upImage) {
			  
			registerIpml.doRegister(upImage);
			
			
		}
		
	//��ת��ע�����
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
}
