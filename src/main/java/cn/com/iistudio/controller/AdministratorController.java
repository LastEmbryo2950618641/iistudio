package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.ICurrentUser;
import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.InfromInter;


@Controller
public class AdministratorController {
	@Autowired
	ICurrentUser iCurrentUser;
	@Autowired
	InfromInter infromInter;
	
	@RequestMapping("admire")
	public ModelAndView CheckAdmire() {
		ModelAndView modelAndView=new ModelAndView();
		if(iCurrentUser.getUser().getPrivilege().equals("2")) {
			modelAndView.setViewName("");
			return modelAndView;
		}
		modelAndView.setViewName("");
		return modelAndView;
		
	}
	
	@ResponseBody
	@RequestMapping("admire")
	public Boolean release(@RequestBody Infrom infrom) {
		
		if(infrom.getUsername()==null) {
			infrom.setUsername(iCurrentUser.getUser().getUserName());
		}
		if(infrom.getDescrible()==null) {
			infrom.setDescrible("此人很懒未有描述");
		}
		if(infromInter.information(infrom)) {
			return true;
		}
		return false;
		
	}
	

}
