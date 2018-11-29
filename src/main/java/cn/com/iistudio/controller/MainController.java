package cn.com.iistudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.ICurrentUser;
import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.entity.User;

import cn.com.iistudio.service.serviceinter.AdministratorInter;

import cn.com.iistudio.mapper.InfromMapper;

import cn.com.iistudio.service.serviceinter.MainInter;


/**
 * @ClassName:DoEnterToMainController
 * @Description:Controller锟斤拷锟斤拷锟截碉拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷url
 * @author:锟斤拷锟斤拷
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
public class MainController {
	//锟斤拷前锟矫伙拷
    @Autowired
  	ICurrentUser icurrentUser;
    @Autowired
    MainInter mainInter;

    @Autowired
    AdministratorInter AdministratorIpml;

    @Autowired
    InfromMapper infromMapper;

    @RequestMapping("resgiterAccount")
	public ModelAndView toRegisterPage()
	{
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.setViewName("main/registerpage");

		return modelAndView;
	}
     /**
      * @Title: /
      * @Description:锟斤拷锟截碉拷."/"锟斤拷url锟斤拷锟斤拷锟斤拷转锟斤拷/index.jsp
      * @param
      * @return:String
      * @throws
      */
	 @RequestMapping("/")
	    public String indexPage(){

	        return "index";

	    }
	 @RequestMapping("loginAccount")
		public ModelAndView toLoginPage()
		{

			ModelAndView modelAndView =new ModelAndView();
			modelAndView.setViewName("main/loginpage");
			return modelAndView;
		}



		@RequestMapping("/InvitateInteriormain")
		public ModelAndView loginSuccessEnter()
		{
			ModelAndView mav = new ModelAndView();
			//锟斤拷前锟矫伙拷
				User user = new User();
			  
				user = icurrentUser.getUser();
			
			if(user != null)
			{
				if(user.getPrivilege().equals("1"))
				{
					mav.setViewName("redirect:interiormain?user=menber");
				}
				else if(user.getPrivilege().equals("2"))
				{
					mav.setViewName("main/select");
				}
			}
		  else 
			{
				mav.setViewName("redirect:interiormain?user=tourist");
				
			}
			
			

			return mav;

		}

		@RequestMapping("/administrator")
		public ModelAndView enToAdmini()
		{
			ModelAndView mav = new ModelAndView();
			List<User> list = AdministratorIpml.getAllMembers();
			User user = new User();
			user = icurrentUser.getUser();
			
			mav.addObject("notice", new Infrom());
			mav.addObject("membersList", list);
			mav.addObject("currentUser", user);
			mav.setViewName("main/managepage");
			return mav;

		}
		
		@RequestMapping("/interiormain")
		public ModelAndView entryInteriormain(@RequestParam("user") String user)
		{	
			
			ModelAndView mav = new ModelAndView();
			List<StudioNews> studioNewsList = mainInter.readDStudioNews(3);
		    
			
			
			User currentUser = icurrentUser.getUser();
			
		
			
			if(user.equals("menber"))
			{
		    mav.addObject("information", infromMapper.getNumber(4));
		    mav.addObject("informations", infromMapper.getless(4));
		    mav.addObject("aiResourceList", mainInter.readResource(10, "content", "ai"));
		    mav.addObject("wfeResourceList", mainInter.readResource(10, "content", "wfe"));
		    mav.addObject("reResourceList", mainInter.readResource(10, "content", "re"));	 
		    
			mav.addObject("currentUser", currentUser);
			mav.addObject("studioNewsList", studioNewsList);
			}
			else if(user.equals("tourist"))
			{
				    mav.addObject("information", infromMapper.getNumberByType(4, "all"));
				    mav.addObject("informations", infromMapper.getlessByType(5, "all"));
				    
				    mav.addObject("aiResourceList", mainInter.readResource(10, "content", "ai"));
				    mav.addObject("wfeResourceList", mainInter.readResource(10, "content", "wfe"));
				    mav.addObject("reResourceList", mainInter.readResource(10, "content", "be"));
				    mav.addObject("bdResourceList", mainInter.readResource(10, "content", "bd"));
				    
					
					mav.addObject("studioNewsList", studioNewsList);
				
			}
			mav.setViewName("main/interiormain");
			
			return mav;
		}
		
}
