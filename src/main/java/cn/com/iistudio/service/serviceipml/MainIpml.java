package cn.com.iistudio.service.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.MemberMapper;
import cn.com.iistudio.mapper.ResourceMapper;
import cn.com.iistudio.mapper.StudioNewMapper;
import cn.com.iistudio.service.serviceinter.MainInter;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


@Service("mainInter")
public class MainIpml implements MainInter{

	
	@Autowired
	StudioNewMapper studioNewMapper;
    @Autowired
    ResourceMapper resourceMapper;
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    MainInter mainInter;
    
	@Override
	public List<StudioNews> readDStudioNews(int num) {
		// TODO Auto-generated method stub
		List<StudioNews> list = studioNewMapper.getNumber(num);
		
		return list;
		
	}
	
	/**
	 * 
	
	* @Title: readResource
	
	* @Description: 
	
	* @param num
	* @return
	 */
	public List<Resource> readResource(int num)
	{
		return null;
		
	}

	@Override
	public List<Resource> readResource(int num, String typeOftype, String type) {
		// TODO Auto-generated method stub
		List<Resource> list = null;
		if(num == 0)
		{
			list = resourceMapper.getAllResources();
		}
		else if(typeOftype.equalsIgnoreCase("CONTENT"))
		{
			String contentType = type;
			list = resourceMapper.getResourcesByContent(num, contentType);
			
		}
		else if(typeOftype.equalsIgnoreCase("FORMAT")) 
		{
			String formatType = type;
			list = resourceMapper.getResourcesByContent(num, formatType);
		}
		
		
		return list;
	}

	@Override
	public JSONArray getMenbers() {
		// TODO Auto-generated method stub
		List<User> list = memberMapper.getAllMembers();
		JSONArray json = JSONArray.fromObject(list); 
		System.out.println(list);
		
		//String jsonwork=json.toString();
		//String jsons=jsonwork.substring(1,jsonwork.length()-1);
		//JSONObject json = JSONObject.fromObject(list1);
		return json;
	}

}
