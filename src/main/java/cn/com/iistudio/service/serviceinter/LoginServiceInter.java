package cn.com.iistudio.service.serviceinter;



import cn.com.iistudio.entity.User;
/**
 * @ClassName:LoginServiceIpml
 * @Description:���ڵ�¼��������
 * @author:chengxiang
 * @date:2018��11��9��
 * @version 1.0
 */
public interface LoginServiceInter {
	
	/**
	 * @description:������������ж�
	 * @param username  password
	 * @return boolean
	 * 
	 */
	public Boolean getlLogin(String username,String password);
	
	/**
	 * @description:��ȡ�û���������Ϣ
	 * @param username  
	 * @return User
	 * 
	 */
	public User getUserinformation(String username);

}
