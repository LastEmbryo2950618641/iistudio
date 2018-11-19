package cn.com.iistudio.service.serviceinter;



import cn.com.iistudio.entity.User;
/**
 * @ClassName:LoginServiceIpml
 * @Description:对于登录做出控制
 * @author:chengxiang
 * @date:2018年11月9日
 * @version 1.0
 */
public interface LoginServiceInter {
	
	/**
	 * @description:对于密码进行判断
	 * @param username  password
	 * @return boolean
	 * 
	 */
	public Boolean getlLogin(String username,String password);
	
	/**
	 * @description:获取用户名所有信息
	 * @param username  
	 * @return User
	 * 
	 */
	public User getUserinformation(String username);

}
