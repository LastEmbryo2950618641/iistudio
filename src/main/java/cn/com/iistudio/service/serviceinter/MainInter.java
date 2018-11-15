package cn.com.iistudio.service.serviceinter;

import java.util.List;

import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;

public interface MainInter {
	
	public List<StudioNews> readDStudioNews(int num);
	public List<Resource> readResource(int num);
    
}
