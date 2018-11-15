package cn.com.iistudio.entity;

public class VideoResources extends Resource {

	private int Id;
	private String TypeByContent;
	private String TypeByFormat;
	private String Video;
	private String DownloadUrl;
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
	public String getVideo() {
		return Video;
	}
	public void setVideo(String video) {
		Video = video;
	}
	public String getDownloadUrl() {
		return DownloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		DownloadUrl = downloadUrl;
	}


}
