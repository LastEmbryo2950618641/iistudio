package cn.com.iistudio.service.serviceipml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;
import cn.com.iistudio.mapper.InfromMapper;
import cn.com.iistudio.service.serviceinter.InfromInter;
@Service("infromImpl")
public class InfromImpl implements InfromInter {

	@Autowired
	InfromMapper infromMapper;

	@Override
	public List<Infrom> getAllinformation() {
		// TODO Auto-generated method stub
		return infromMapper.getAllinformation();
	}

	@Override
	public List<Infrom> getUserinformation(String username) {
		// TODO Auto-generated method stub
		return infromMapper.getUserinformation(username);
	}

	@Override
	public Infrom getOneinformation(int id) {
		// TODO Auto-generated method stub
		return infromMapper.getOneinformation(id);
	}

	@Override
	public List<Infrom> getNumber(int number) {
		// TODO Auto-generated method stub
		return infromMapper.getNumber(number);
	}

	@Override
	public Boolean information(Infrom infrom) {
		// TODO Auto-generated method stub
		return infromMapper.information(infrom);
	}

}
