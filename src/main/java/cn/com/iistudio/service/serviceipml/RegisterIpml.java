package cn.com.iistudio.service.serviceipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.service.serviceinter.RegisterInter;

@Service("registerIpml")
public class RegisterIpml implements RegisterInter{

	@Autowired
	 User user;
	
	//¹Ë¿Í×¢²á
	@Override
	public void doRegister(UpImage upImage) {
		// TODO Auto-generated method stub
		
		upImage.base64ToWhere("E:\\123.jpg");
		
	}

}
