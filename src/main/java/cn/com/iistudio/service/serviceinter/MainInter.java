package cn.com.iistudio.service.serviceinter;

import java.util.List;


import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;
import net.sf.json.JSONObject;

public interface MainInter {
	
	public List<StudioNews> readDStudioNews(int num);
	public List<Resource> readResource(int num,String typeOftype,String type);
    public JSONObject getMenbers();
}
