package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * @ClassName:Code
 * @Description:对于权限实体
 * @author:chengxiang
 * @date:2018年11月9日
 * @version 1.0
=======
 * @ClassName:Privilege
 * @Description:Model，权限实体类
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
>>>>>>> b360b0c67f8c66d105d9075538743464c192aca2
 */
@Component
@Scope("singleton")
public class Privilege {
	//权限等级
	private String id;
	//描述
	private String description;
	
	
	/**
	 * @Description:获取id
	 * @return String
	 */
	public String getId() {
		return id;
	}
	/**
	 * @Description:设置id
	 * @return String
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @Description:获得description
	 * @return String
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @Description:设置description
	 * @return String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String tocheck() {
		
		return description;
		
	}
	
}
