package cn.com.iistudio.entity;

import java.sql.Timestamp;

public class Resource {
	
	private int id;
	private String username;
	private Timestamp Pubdata;
    private String Title;
    private String Description;
    private String TypeByContent;
	private String TypeByFormat;
	public String getTypeByContent() {
		return TypeByContent;
	}
	public void setTypeByContent(String typeByContent) {
		TypeByContent = typeByContent;
	}
	public String getTypeByFormat() {
		return TypeByFormat;
	}
	public void setTypeByFormat(String typeByFormat) {
		TypeByFormat = typeByFormat;
	}
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
		return Pubdata;
	}
	public void setPubdata(Timestamp pubdata) {
		Pubdata = pubdata;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
    
  
}
