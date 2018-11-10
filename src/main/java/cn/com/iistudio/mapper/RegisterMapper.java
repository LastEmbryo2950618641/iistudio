package cn.com.iistudio.mapper;

import cn.com.iistudio.entity.User;
 /**
  * @Description:持久层接口，注册信息与数据库的交互
  * @author liuqi
  * @date 2018.11.8 
  * @version 1.0
  */
public interface RegisterMapper {
	
	public void writeTourist(User user);

}
