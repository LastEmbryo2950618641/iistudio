package cn.com.iistudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.ICurrentUser;
import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.AdministratorInter;
import cn.com.iistudio.service.serviceinter.MainInter;


/**
 * @ClassName:DoEnterToMainController
 * @Description:Controller，拦截到达主界面的url
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
public class MainController {
	//当前用户
    @Autowired
  	ICurrentUser currentUser;
    @Autowired
    MainInter mainInter;
    @Autowired
    AdministratorInter AdministratorIpml;
     
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
		 modelAndView.addObject("user", currentUser.getUser());
		 modelAndView.setViewName("main/main");
		 return modelAndView; 
	 }

	 
		@RequestMapping("/interiormain.php")
		public ModelAndView loginSuccessEnter()
		{
			ModelAndView mav = new ModelAndView();
			//当前用户
			User user = new User();
			user = currentUser.getUser();
			//动态信息
			List<StudioNews> studioNewsList = null;	
			//资源
			List<Resource> resourcesList = null;
		
			if(!StringUtils.isEmpty(user))
			{
		  
			studioNewsList = mainInter.readDStudioNews(3);
			resourcesList = mainInter.readResource(4, "CONTENT", "ai");
		
			mav.addObject("currentUser", user);
			mav.addObject("studioNewsList", studioNewsList);
			mav.setViewName("main/interiormain");
			}
			else
			{
			mav.setViewName("main/loginpage");
			}
			
			return mav;
			
		}
		
		@RequestMapping("/administrator")
		public ModelAndView enToAdmini()
		{
			ModelAndView mav = new ModelAndView();
			List<User> list = AdministratorIpml.getAllMembers();
			mav.addObject("membersList", list);
			mav.setViewName("");
			return mav;
			
		}
}
