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

	private int Id;//����Id
	private String Username;//�ϴ����û���
	private String Pubdata;//�ϴ�����
	private String Text;//��������
	private String Image;//����ͼƬ
	private String Attachment;//���Ÿ�ҳ
	private String Title;//��ҳ
	private String Description;
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
  
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPubdata() {
		return Pubdata;
	}
	public void setPubdata(String pubdata) {
		Pubdata = pubdata;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public String getAttachment() {
		return Attachment;
	}
	public void setAttachment(String attachment) {
		Attachment = attachment;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}


}
