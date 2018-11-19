package cn.com.iistudio.mapper;

import java.util.List;

import cn.com.iistudio.entity.User;

public interface LoginMapper {
    public List<User> getAll();
    public User getUserInformation(String username);
}
