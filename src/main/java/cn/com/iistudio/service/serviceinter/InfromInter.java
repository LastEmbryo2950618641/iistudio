package cn.com.iistudio.service.serviceinter;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;

public interface InfromInter {
    
	
	   public List<StudioNews> getAllinformation();

	   public List<StudioNews> getUserinformation(String username);

	   public StudioNews getOneinformation(int Id);

	   public List<StudioNews> getNumber(int number);

	   public Boolean information(Infrom infrom);
}
