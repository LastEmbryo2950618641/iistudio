package cn.com.iistudio.entity;

import java.sql.Timestamp;

public class Resource {

	private int id;
	private String username;
	private Timestamp pubdata;
    private String title;
    private String description;
    private String typeByContent;
	private String typeByFormat;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Timestamp getPubdata() {
		return pubdata;
	}
	public void setPubdata(Timestamp pubdata) {
		this.pubdata = pubdata;
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
	public String getTypeByContent() {
		return typeByContent;
	}
	public void setTypeByContent(String typeByContent) {
		this.typeByContent = typeByContent;
	}
	public String getTypeByFormat() {
		return typeByFormat;
	}
	public void setTypeByFormat(String typeByFormat) {
		this.typeByFormat = typeByFormat;
	}
	
	
	
	



}
