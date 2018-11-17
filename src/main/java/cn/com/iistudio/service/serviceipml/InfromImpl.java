package cn.com.iistudio.service.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.mapper.InfromMapper;
import cn.com.iistudio.service.serviceinter.InfromInter;

@Service("infromInter")
public class InfromImpl implements InfromInter {
	
	@Autowired
	InfromMapper infromMapper;

	@Override
	public List<StudioNews> getAllinformation() {
		// TODO Auto-generated method stub
		return infromMapper.getAllinformation();
	}

	@Override
	public List<StudioNews> getUserinformation(String UserName) {
		// TODO Auto-generated method stub
		return infromMapper.getUserinformation(UserName);
	}

	@Override
	public StudioNews getOneinformation(int Id) {
		// TODO Auto-generated method stub
		return infromMapper.getOneinformation(Id);
	}

	@Override
	public List<StudioNews> getNumber(int number) {
		// TODO Auto-generated method stub
		return infromMapper.getNumber(number);
	}

	

	@Override
	public Boolean information(Infrom infrom) {
		// TODO Auto-generated method stub
		return infromMapper.information(infrom);
	}

}
