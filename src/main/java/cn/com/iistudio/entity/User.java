package cn.com.iistudio.entity;


import org.springframework.stereotype.Component;


/**
 * @ClassName:User
 * @Description:用户实体类，当前用户
 * @author:刘奇
 * @date:2018.11.8
 * @version:1.0
 *
 */

@Component
public class User {
	
	private String nickname;//昵称
	private String username;//用户名
	private String password;//密码
	private String gender;//性别
	private String headImage;//头像地址
	private String email;//邮件
	private String tel;//电话号码
	private String introduce;//自我介绍
	private Privilege privilege;//权限
	
	
	
	  
    /**
     * 
     * @Description:geter()，seter()方法
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
