package cn.com.iistudio.service.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.Privilege;
import cn.com.iistudio.mapper.TestMapper;


@Service("testServiceIpml")
public class TestServiceIpml implements cn.com.iistudio.service.serviceinter.TestServiceInter {
    
	@Autowired
	TestMapper testDao;
	
	@Override
	public List<Privilege> getAll() {
		// TODO Auto-generated method stub
		return testDao.getAll();
	}

}
