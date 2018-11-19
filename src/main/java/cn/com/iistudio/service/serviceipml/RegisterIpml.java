package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.RegisterMapper;
import cn.com.iistudio.service.serviceinter.RegisterInter;
/**
 * @Description:ҵ���ʵ���࣬ע����Ϣҵ���߼�
 * @author liuqi
 * @date 2018.11.8 
 * @version 1.0
 */
@Service("registerIpml")
public class RegisterIpml implements RegisterInter{
	//�־ò�ӿ�
    @Autowired
	RegisterMapper registerMapper;
    //��ǰ�û�
	@Autowired
	//ͷ��洢���ļ���·��
	 User user;
	 final String folderPath = "E:\\";
	 /**
	  * @Description:����ͷ��
	  * @param:UpImage
	  * @return:boolean
	  */
	
	@Override
	public boolean doRegisterUpImage(UpImage upImage) {
		// TODO Auto-generated method stub
		
		String storePath = upImage.base64ToWhere(folderPath,user.getUserName());
		if(!storePath.equals(""))
		{
		user.setHeadImage(storePath);
		registerMapper.writeTouristAccount(user);
		registerMapper.writeTourist(user);
		return true;
		}
		else
		{
		return false;
		}
		
	}

	 /**
	  * @Description:����ע���û�����
	  * @param:UpImage
	  * @return:boolean
	  */
	@Override
	public boolean doRegisterAccounct(UpUser upUser) {
		// TODO Auto-generated method stub
		
		//��������
		user.setNickName(upUser.getNickname());
		user.setUserName(upUser.getUsername());
		user.setPassword(upUser.getPassword());
		user.setEmail(upUser.getEmail());
		user.setTel(upUser.getTell());
		user.setGender(upUser.getGender());
		
		
		
		
		return true;
	}

}
