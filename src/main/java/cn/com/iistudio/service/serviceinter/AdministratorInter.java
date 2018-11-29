package cn.com.iistudio.service.serviceinter;

import java.util.List;

import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.User;

public interface AdministratorInter {
	
	public void deleteMember(String username);
	public void deleteMembers(String[] username);
    public List<User> getAllMembers();
    public void chengePrivilege(String command,String privilege,String username);
    public void storgeInform(Infrom infrom,String scope);
    public Boolean updata(User user);
 
}
