package cn.com.iistudio.entity;

public class ArticleResources {
	private int Id;
	private String TypeByContent;
	private String TypeByFormat;
	private String Image;
	private String Text;
	private String Attachment;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
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
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getAttachment() {
		return Attachment;
	}
	public void setAttachment(String attachment) {
		Attachment = attachment;
	}
	

}
