package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.CheckMapper;
import cn.com.iistudio.service.serviceinter.CheckInter;

/**
 * @ClassName:LoginServiceIpml
 * @Description:����Ȩ�޽��л�ȡ
 * @author:chengxiang
 * @date:2018��11��9��
 * @version 1.0
 */
@Service("LoginCheckImpl")
public class CheckImpl implements CheckInter {
	
	@Autowired
	CheckMapper checkMapper;

	/**
	 * @description:��ȡ�û�Ȩ��
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
