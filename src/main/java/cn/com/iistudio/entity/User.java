package cn.com.iistudio.entity;


import org.springframework.stereotype.Component;


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

	private String nickname;//�ǳ�
	private String username;//�û���
	private String password;//����
	private String gender;//�Ա�
	private String headImage;//ͷ����ַ
	private String email;//�ʼ�
	private String tel;//�绰����
	private String introduce;//���ҽ���
	private Privilege privilege;//Ȩ��




    /**
     *
     * @Description:geter()��seter()����
     */


	public String getPassword() {
		return password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
