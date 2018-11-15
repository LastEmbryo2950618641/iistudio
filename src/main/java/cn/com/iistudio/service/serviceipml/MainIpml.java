package cn.com.iistudio.service.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.Resource;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.mapper.StudioNewMapper;
import cn.com.iistudio.service.serviceinter.MainInter;

@Service("mainInter")
public class MainIpml implements MainInter{

	
	@Autowired
	StudioNewMapper studioNewMapper;

	@Override
	public List<StudioNews> readDStudioNews(int num) {
		// TODO Auto-generated method stub
		List<StudioNews> list = studioNewMapper.getNumber(num);
		
		return list;
		
	}
	
	public List<Resource> readResource(int num)
	{
		return null;
		
	}

}
