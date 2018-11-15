package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @ClassName:User
 * @Description:�û�ʵ���࣬��ǰ�û�
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Component
public class User {
	
	private String nickName;//�ǳ�
	private String userName;//�û���
	private String password;//����
	private String gender;//�Ա�
	private String headImage;//ͷ���ַ
	private String email;//�ʼ�
	private String tel;//�绰����
	private String introduce;//���ҽ���
	private Privilege privilege;//Ȩ��
	
	
	
	  
    /**
     * 
     * @Description:geter()��seter()����
     */
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHeadImage() {
		return headImage;
	}
	public void setHeadImage(String headImage) {
		this.headImage = headImage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}
	

}
