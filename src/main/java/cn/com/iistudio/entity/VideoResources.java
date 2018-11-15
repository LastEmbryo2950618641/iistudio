package cn.com.iistudio.entity;

public class VideoResources extends Resource {

	private int Id;
	
	private String Video;
	private String DownloadUrl;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
