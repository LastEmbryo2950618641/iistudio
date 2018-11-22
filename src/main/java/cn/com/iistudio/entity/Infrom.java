package cn.com.iistudio.entity;

import java.sql.Timestamp;

public class Infrom {
	private int id;
	private String title;
	private String description;
	private String text;
	private Timestamp pubdata;
	private String username;
	private String scope;
	
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
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
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
