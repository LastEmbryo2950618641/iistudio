package cn.com.iistudio.mapper;

public interface PermissionsMapper {
	
	public Boolean addPermission(String UserName);
	
	public Boolean increasePermission(String UserName);
	
	public Boolean deleteone(String UserName);

}
