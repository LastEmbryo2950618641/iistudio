package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.LoginMapper;

import cn.com.iistudio.service.serviceinter.LoginServiceInter;
/**
 * @ClassName:LoginServiceIpml
 * @Description:对于登录做出控制
 * @author:chengxiang
 * @date:2018年11月9日
 * @version 1.0
 */
@Service("loginServiceIpml")
public class LoginServiceIpml implements LoginServiceInter {
	
	@Autowired
	LoginMapper testDao;
	
	/**
	 * @description:对于密码进行判断
	 * @param username  password
	 * @return boolean
	 * 
	 */
	@Override
	public Boolean getlLogin(String username,String password) {
		// TODO Auto-generated method stub
		System.out.println(username);
		
		//对输入的用户名以及密码进行判断
		for(int i=0;i<testDao.getAll().size();i++) {
			System.out.println(testDao.getAll().get(i).getUserName());
			System.out.println(testDao.getAll().get(i).getPassword());
			if(username.equals(testDao.getAll().get(i).getUserName())&&password.equals(testDao.getAll().get(i).getPassword())) {
				return true;
			}
		}
		
		return false;
	}

	/**
	 * @description:获取用户名所有信息
	 * @param username  
	 * @return User
	 * 
	 */
	@Override
	public User getUserinformation(String UserName) {
		// TODO Auto-generated method stub
		return testDao.getUserInformation(UserName);
	}

}
