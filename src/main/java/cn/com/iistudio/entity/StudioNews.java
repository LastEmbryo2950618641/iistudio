package cn.com.iistudio.entity;
/**
 * @ClassName:SecurityCode
 * @Description:新闻类
 * @author:chengxaing
 * @date:2018.11.12
 * @version:1.0
 *
 */
public class StudioNews {
    
	private int Id;//新闻Id
	private String Username;//上传人用户名
	private String Pubdata;//上传日期
	private String Text;//新闻内容
	private String Image;//新闻图片
	private String Attachment;//新闻附页
	private String Title;//主页
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
