package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.StudioNews;

public interface InfromMapper {

	   public List<Infrom> getAllinformation();

	   public List<Infrom> getUserinformation(String username);

	   public Infrom getOneinformation(int id);

	   public List<Infrom> getNumber(int number);
	   
	   public List<Infrom> getless(int number);
	   
       public List<Infrom> getNumberByType(int number,String type);
	   
	   public List<Infrom> getlessByType(int number,String type);

	   public Boolean information(Infrom infrom);
	   
	   public void insertNotice(Infrom infrom);

	
}
