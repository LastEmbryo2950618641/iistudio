package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @ClassName:Privilege
 * @Description:Model，权限实体类
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
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
	
	
}
