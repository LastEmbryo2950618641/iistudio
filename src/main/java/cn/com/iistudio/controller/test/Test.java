package cn.com.iistudio.controller.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.iistudio.entity.Privilege;
import cn.com.iistudio.service.serviceinter.TestServiceInter;


/**
 * @ClassName:Test
 * @Description:Controller，测试Controller
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */
@Controller
@RequestMapping("/test")
public class Test {
	
	//测试用，sevice接口
	@Autowired
	TestServiceInter testServiceIpml;
	


	

	/**
     * @Title:/resgiter/test.do
     * @Description:测试用，是否可以向页面传值
     * @param:upUser
     * @return:boolean
     * @throws
     */
	@RequestMapping("/test.do")
	public ModelAndView test()
	{
		
	 	List<Privilege> list = testServiceIpml.getAll();
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("list", list);
		modelAndView.setViewName("main");
		return modelAndView;
		
	}

}
