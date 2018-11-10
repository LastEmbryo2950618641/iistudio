package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.LoginMapper;

import cn.com.iistudio.service.serviceinter.LoginServiceInter;
/**
 * @ClassName:LoginServiceIpml
 * @Description:���ڵ�¼��������
 * @author:chengxiang
 * @date:2018��11��9��
 * @version 1.0
 */
@Service("loginServiceIpml")
public class LoginServiceIpml implements LoginServiceInter {
	
	@Autowired
	LoginMapper testDao;
	
	/**
	 * @description:������������ж�
	 * @param username  password
	 * @return boolean
	 * 
	 */
	@Override
	public Boolean getlLogin(String username,String password) {
		// TODO Auto-generated method stub
		System.out.println(username);
		
		//��������û����Լ���������ж�
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
	 * @description:��ȡ�û���������Ϣ
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
