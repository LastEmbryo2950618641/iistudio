package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;

public interface InfromMapper {

	   public List<StudioNews> getAllinformation();

	   public List<StudioNews> getUserinformation(String UserName);

	   public StudioNews getOneinformation(int Id);

	   public List<StudioNews> getNumber(int number);

	   public Boolean information(Infrom infrom);

	
}