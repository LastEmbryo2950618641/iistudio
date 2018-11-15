package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.Resource;


public interface ResourceMapper {
	
	public List<Resource> getResourcesByContent(int num,String ContentType);
	public List<Resource> getResourcesByFormat(int num,String FormatType);
	
	public List<Resource> getResources(int num);
	public List<Resource> getAllResources();

}
