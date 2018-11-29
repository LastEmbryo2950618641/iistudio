package cn.com.iistudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.ICurrentUser;
import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.AdministratorInter;
import cn.com.iistudio.service.serviceinter.InfromInter;
import cn.com.iistudio.service.serviceinter.MainInter;
import net.sf.json.JSONObject;

import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Controller
@RequestMapping("/Administrator")
public class AdministratorController {
	@Autowired
	ICurrentUser iCurrentUser;
	@Autowired
	InfromInter infromInter;
	@Autowired
	AdministratorInter AdministratorIpml;
	@Autowired
	MainInter mainInter;

	@RequestMapping("admire")
	public ModelAndView checkAdmire() {
		ModelAndView modelAndView=new ModelAndView();
		if(iCurrentUser.getUser().getPrivilege().equals("2")) {
			modelAndView.setViewName("");
			return modelAndView;
		}
		modelAndView.setViewName("");
		return modelAndView;

	}

	@ResponseBody
	@RequestMapping("release")
	public Boolean release(@RequestBody Infrom infrom) {

		if(infrom.getUsername()==null) {
			infrom.setUsername(iCurrentUser.getUser().getUsername());
		}
		if(infrom.getDescription()==null) {
			infrom.setDescription("���˺���δ������");
		}
		if(infrom.getPubdata()==null) {
	     Date d = new Date();
	     Timestamp pubdata=(Timestamp)d;
	     infrom.setPubdata(pubdata);
		}
		if(infrom.getPubdata()==null) {
	     Date d = new Date();
	     Timestamp pubdata=(Timestamp)d;
	     infrom.setPubdata(pubdata);
		}
		if(infromInter.information(infrom)) {
			return true;
		}
		return false;

	}

    
	@RequestMapping(value="delete",method = RequestMethod.POST)
	public ModelAndView delect(@RequestParam("username") String username)
	{
		AdministratorIpml.deleteMember(username);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/525station/administrator");

		return modelAndView;

	}

    @RequestMapping("add")
	public ModelAndView addPrivilege(@RequestParam("privilege") String privilege,@RequestParam("username") String username)
	{
		AdministratorIpml.chengePrivilege("add", privilege,username);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/525station/administrator");
		return modelAndView;

	}

	@RequestMapping("reduce")
	public ModelAndView reducePrivilege(@RequestParam("privilege") String privilege,@RequestParam("username") String username)
	{

		AdministratorIpml.chengePrivilege("reduce", privilege,username);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/525station/administrator");
		return modelAndView;
	}

	@ResponseBody
	@RequestMapping("deleteSelected")
	public ModelAndView deleteSelected(@RequestParam("usernames") String[] usernames)
	{

		AdministratorIpml.deleteMembers(usernames);

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/525station/administrator");
		return modelAndView;
	}
	
	
	@RequestMapping("releaseInform")
	public ModelAndView reducePrivilege(@ModelAttribute("notice") Infrom infrom,@RequestParam("scope") String scope)
	{
		AdministratorIpml.storgeInform(infrom, scope);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("redirect:/administrator");
		return modelAndView;

		
	}
	
	@ResponseBody
	@RequestMapping(value="update",method=RequestMethod.POST)
	public ModelAndView update(User user) {
		System.out.println(user.getIntroduce());
		ModelAndView modelAndView=new ModelAndView();
		if(user.getPassword()==null&& user.getNickname()==null&&user.getIntroduce()==null) {
			modelAndView.setViewName("main/edit");
			return modelAndView;
		}else {
			AdministratorIpml.updata(user);
			modelAndView.setViewName("");
		return modelAndView;
		}
	}

}
