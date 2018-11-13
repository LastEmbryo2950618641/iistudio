package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.VideoResources;

public interface VideoMapper {
    
	public List<VideoResources> getAll();
	
	public List<VideoResources> getUserVideo(String UserName);
	
	public List<VideoResources> getnumber(int number);
	
	public VideoResources getId(int Id);
}
