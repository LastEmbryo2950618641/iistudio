package cn.com.iistudio.entity;

import java.sql.Timestamp;

public class Infrom {
	private int id;
	private String title;
	private String describle;
	private String text;
	private Timestamp pubdata;
	private String username;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescrible() {
		return describle;
	}
	public void setDescrible(String describle) {
		this.describle = describle;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
	public Timestamp getPubdata() {
		return pubdata;
	}
	public void setPubdata(Timestamp pubdata) {
		this.pubdata = pubdata;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
