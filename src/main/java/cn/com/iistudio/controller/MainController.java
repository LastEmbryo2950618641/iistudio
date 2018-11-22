package cn.com.iistudio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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
 * @Description:Controller�����ص�����������url
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Controller
public class MainController {
	//��ǰ�û�
    @Autowired
  	ICurrentUser currentUser;
    @Autowired
    MainInter mainInter;

    @Autowired
    AdministratorInter AdministratorIpml;

    @Autowired
    InfromMapper infromMapper;


     /**
      * @Title: /
      * @Description:���ص�."/"��url������ת��/index.jsp
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
      * @Description:���ص�.��/main.asp����url�����͵�ǰ�û���Ϣ(user)����ת��/main/main.jsp
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
			//��ǰ�û�
			User user = new User();
			user = currentUser.getUser();
			

			if(!StringUtils.isEmpty(user))
			{

				if(!user.getPrivilege().equals("2"))
				{
					mav.setViewName("redirect:interiormain");
				}
				else
				{
					mav.setViewName("main/select");
				}
			
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
			User user = new User();
			user = currentUser.getUser();
			
			mav.addObject("notice", new Infrom());
			mav.addObject("membersList", list);
			mav.addObject("currentUser", user);
			mav.setViewName("main/managepage");
			return mav;

		}
		
		@RequestMapping("/interiormain")
		public ModelAndView entryInteriormain()
		{	
			ModelAndView mav = new ModelAndView();
			List<StudioNews> studioNewsList = mainInter.readDStudioNews(3);
			User user = new User();
			user = currentUser.getUser();
		
			
		    mav.addObject("information", infromMapper.getNumber(4));
		    mav.addObject("informations", infromMapper.getless(4));
		    
		    
			mav.addObject("currentUser", user);
			mav.addObject("studioNewsList", studioNewsList);
			mav.setViewName("main/interiormain");
			
			return mav;
		}
}
