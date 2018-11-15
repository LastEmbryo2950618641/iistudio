package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.User;


@Controller
public class AdministratorController {
	
	@RequestMapping("admire")
	public ModelAndView CheckAdmire() {
		
		return null;
		
	}
	

}
