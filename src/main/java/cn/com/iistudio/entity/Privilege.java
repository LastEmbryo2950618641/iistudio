package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Ȩ����
 * 
 * 
 */
@Component
@Scope("singleton")
public class Privilege {
	//Ȩ�޵ȼ�
	private String id;
	//����
	private String description;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "privilege [id=" + id + ", description=" + description + "]";
	}
	
}
