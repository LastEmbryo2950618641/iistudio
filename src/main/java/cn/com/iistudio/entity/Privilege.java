package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
<<<<<<< HEAD
 * @ClassName:Code
 * @Description:����Ȩ��ʵ��
 * @author:chengxiang
 * @date:2018��11��9��
 * @version 1.0
=======
 * @ClassName:Privilege
 * @Description:Model��Ȩ��ʵ����
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
>>>>>>> b360b0c67f8c66d105d9075538743464c192aca2
 */
@Component
@Scope("singleton")
public class Privilege {
	//Ȩ�޵ȼ�
	private String id;
	//����
	private String description;
	
	
	/**
	 * @Description:��ȡid
	 * @return String
	 */
	public String getId() {
		return id;
	}
	/**
	 * @Description:����id
	 * @return String
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @Description:���description
	 * @return String
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @Description:����description
	 * @return String
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String tocheck() {
		
		return description;
		
	}
	
}
