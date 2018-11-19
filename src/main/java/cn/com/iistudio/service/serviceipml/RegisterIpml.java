package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.RegisterMapper;
import cn.com.iistudio.service.serviceinter.RegisterInter;
/**
 * @Description:业务层实现类，注册信息业务逻辑
 * @author liuqi
 * @date 2018.11.8 
 * @version 1.0
 */
@Service("registerIpml")
public class RegisterIpml implements RegisterInter{
	//持久层接口
    @Autowired
	RegisterMapper registerMapper;
    //当前用户
	@Autowired
	//头像存储问文件夹路径
	 User user;
	 final String folderPath = "E:\\";
	 /**
	  * @Description:处理头像
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
	  * @Description:处理注册用户数据
	  * @param:UpImage
	  * @return:boolean
	  */
	@Override
	public boolean doRegisterAccounct(UpUser upUser) {
		// TODO Auto-generated method stub
		
		//存入数据
		user.setNickName(upUser.getNickname());
		user.setUserName(upUser.getUsername());
		user.setPassword(upUser.getPassword());
		user.setEmail(upUser.getEmail());
		user.setTel(upUser.getTell());
		user.setGender(upUser.getGender());
		
		
		
		
		return true;
	}

}
