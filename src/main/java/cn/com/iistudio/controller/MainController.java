package cn.com.iistudio.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

		@RequestMapping(value="/json.do",method = RequestMethod.GET)
		public @ResponseBody Map<String, Object> getJson() {
//			net.sf.json.JSONArray data=mainInter.getMenbers();
//			String data1=data.toString();
//			
//		    String data3="{\"code\":0,\"msg\":0,\"data\":" +data1 + "}";
//			System.out.println(data3);
//			System.out.println("------------------------------");
			net.sf.json.JSONArray data=mainInter.getMenbers();
			Map<String,Object> datasource=new LinkedHashMap<String,Object>();
			 datasource.put("code",0);
		     datasource.put("count",2);
		     datasource.put("data", data);
			return datasource;
			
		}
		@ResponseBody
		@RequestMapping(value="toturnchange",method = RequestMethod.GET)
		public ModelAndView toturnchange(User user) {
			System.out.println(user.getPassword());
			System.out.println(user.getUsername());
			ModelAndView modelAndView =new ModelAndView();
			modelAndView.addObject("username", user.getUsername());
			modelAndView.setViewName("main/edit");
			return modelAndView;
			
		}
		
		
		
}
