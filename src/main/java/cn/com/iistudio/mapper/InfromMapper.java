package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;

public interface InfromMapper {

	   public List<StudioNews> getAllinformation();

	   public List<StudioNews> getUserinformation(String username);

	   public StudioNews getOneinformation(int id);

	   public List<StudioNews> getNumber(int number);
	   
	   public List<StudioNews> getless(int number);

	   public Boolean information(Infrom infrom);

	
}
