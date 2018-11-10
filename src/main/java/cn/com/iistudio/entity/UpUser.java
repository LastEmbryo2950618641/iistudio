package cn.com.iistudio.entity;

/**
 * @ClassName:UpUser
 * @Description:上传用户实体类，用于用户注册信息上传后台
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */
public class UpUser {
	//昵称
	 private String nickname;
	 private String username;//用户名，唯一标示
	 private String password;//密码
	 private String gender;//性别
	 private String tell;//电话号码
	 private String email;//邮件
	 /**
	  * @Description:获得昵称
	  * @return String
	  */
	public String getNickname() {
		return nickname;
	}
	/**
	  * @Description:设置昵称
	  * @return 
	  */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	  * @Description:获得用户名
	  * @return String
	  */
	public String getUsername() {
		return username;
	}
	/**
	  * @Description:设置用户名
	  * @return 
	  */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	  * @Description:获得密码
	  * @return String
	  */
	public String getPassword() {
		return password;
	}
	/**
	  * @Description:设置密码
	  * @return 
	  */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	  * @Description:获得性别
	  * @return String
	  */
	public String getGender() {
		return gender;
	}
	/**
	  * @Description:设置性别
	  * @return 
	  */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	  * @Description:获得号码
	  * @return String
	  */
	public String getTell() {
		return tell;
	}
	/**
	  * @Description:设置号码
	  * @return 
	  */
	public void setTell(String tell) {
		this.tell = tell;
	}
	/**
	  * @Description:获得邮件
	  * @return String
	  */
	public String getEmail() {
		return email;
	}
	/**
	  * @Description:设置邮件
	  * @return 
	  */
	public void setEmail(String email) {
		this.email = email;
	}
	
	 

}
