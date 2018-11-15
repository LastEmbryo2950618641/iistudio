package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.ArticleResources;

public interface ArticleMapper {
  
	public List<ArticleResources> getAll();
	
	public List<ArticleResources> getUserArticle(String UserName);
	
	public List<ArticleResources> getnumber(int number);
	
	public ArticleResources getId(int Id);
}
