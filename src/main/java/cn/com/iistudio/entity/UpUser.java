package cn.com.iistudio.entity;

/**
 * @ClassName:UpUser
 * @Description:�ϴ��û�ʵ���࣬�����û�ע����Ϣ�ϴ���̨
 * @author:����
 * @date:2018.11.8
 * @version:1.0
 *
 */
public class UpUser {
	//�ǳ�
	 private String nickname;
	 private String username;//�û�����Ψһ��ʾ
	 private String password;//����
	 private String gender;//�Ա�
	 private String tell;//�绰����
	 private String email;//�ʼ�
	 /**
	  * @Description:����ǳ�
	  * @return String
	  */
	public String getNickname() {
		return nickname;
	}
	/**
	  * @Description:�����ǳ�
	  * @return 
	  */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	  * @Description:����û���
	  * @return String
	  */
	public String getUsername() {
		return username;
	}
	/**
	  * @Description:�����û���
	  * @return 
	  */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	  * @Description:�������
	  * @return String
	  */
	public String getPassword() {
		return password;
	}
	/**
	  * @Description:��������
	  * @return 
	  */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	  * @Description:����Ա�
	  * @return String
	  */
	public String getGender() {
		return gender;
	}
	/**
	  * @Description:�����Ա�
	  * @return 
	  */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	  * @Description:��ú���
	  * @return String
	  */
	public String getTell() {
		return tell;
	}
	/**
	  * @Description:���ú���
	  * @return 
	  */
	public void setTell(String tell) {
		this.tell = tell;
	}
	/**
	  * @Description:����ʼ�
	  * @return String
	  */
	public String getEmail() {
		return email;
	}
	/**
	  * @Description:�����ʼ�
	  * @return 
	  */
	public void setEmail(String email) {
		this.email = email;
	}
	
	 

}
