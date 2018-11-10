package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.CheckMapper;
import cn.com.iistudio.service.serviceinter.CheckInter;

/**
 * @ClassName:LoginServiceIpml
 * @Description:对于权限进行获取
 * @author:chengxiang
 * @date:2018年11月9日
 * @version 1.0
 */
@Service("LoginCheckImpl")
public class CheckImpl implements CheckInter {
	
	@Autowired
	CheckMapper checkMapper;

	/**
	 * @description:获取用户权限
	 * @param user 
	 * @return String
	 * 
	 */
	@Override
	public String getCheck(User user) {
		// TODO Auto-generated method stub
		return checkMapper.getCheck(user);
	}

}
