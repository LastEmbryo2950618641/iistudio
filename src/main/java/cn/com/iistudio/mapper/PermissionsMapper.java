package cn.com.iistudio.mapper;

public interface PermissionsMapper {
	
	public Boolean addPermission(String username);
	
	public Boolean increasePermission(String username);
	
	public Boolean deleteone(String username);

}
