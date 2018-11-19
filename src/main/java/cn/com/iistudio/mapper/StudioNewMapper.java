package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.StudioNews;

public interface StudioNewMapper {
   public List<StudioNews> getAllNews();

   public List<StudioNews> getUserNews(String uername);

   public StudioNews getOneNew(int Id);

   public List<StudioNews> getNumber(int number);

   public Boolean insertNew(StudioNews studioNew);
}
