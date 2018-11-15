package cn.com.iistudio.entity;
/**
 * @ClassName:SecurityCode
 * @Description:������
 * @author:chengxaing
 * @date:2018.11.12
 * @version:1.0
 *
 */
public class StudioNews {

	private int id;//����Id
	private String username;//�ϴ����û���
	private String pubdata;//�ϴ�����
	private String text;//��������
	private String image;//����ͼƬ
	private String attachment;//���Ÿ�ҳ
	private String title;//��ҳ
	private String description;
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
	public String getPubdata() {
		return pubdata;
	}
	public void setPubdata(String pubdata) {
		this.pubdata = pubdata;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
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
	
	


}
