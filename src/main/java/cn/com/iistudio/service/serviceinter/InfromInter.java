package cn.com.iistudio.service.serviceinter;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;

public interface InfromInter {
    
	
	   public List<Infrom> getAllinformation();

	   public List<Infrom> getUserinformation(String username);

	   public Infrom getOneinformation(int id);

	   public List<Infrom> getNumber(int number);

	   public Boolean information(Infrom infrom);
}
