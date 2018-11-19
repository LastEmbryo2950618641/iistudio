package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.User;

public interface MemberMapper {
	
	public void deleteMember(String username);
	public List<User> getAllMembers();
	
}
