package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.StudioNews;

public interface StudioNewMapper {
   public List<StudioNews> getAllNews();

   public List<StudioNews> getUserNews(String username);

   public StudioNews getOneNew(int id);

   public List<StudioNews> getNumber(int number);

   public Boolean insertNew(StudioNews studioNew);
}
