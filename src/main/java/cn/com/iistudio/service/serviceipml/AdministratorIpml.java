package cn.com.iistudio.service.serviceipml;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.iistudio.entity.ICurrentUser;
import cn.com.iistudio.entity.Infrom;
import cn.com.iistudio.entity.User;
import cn.com.iistudio.mapper.InfromMapper;
import cn.com.iistudio.mapper.MemberMapper;
import cn.com.iistudio.mapper.PrivilegeMapper;
import cn.com.iistudio.service.serviceinter.AdministratorInter;

@Service("AdministratorIpml")
public class AdministratorIpml implements AdministratorInter {

	@Autowired
	MemberMapper memberMapper;
	@Autowired
	PrivilegeMapper privilegeMapper;
	@Autowired
	ICurrentUser CurrentUser;
	@Autowired
	InfromMapper infromMapper;
	
	
	@Override
	public void deleteMember(String username) {
		// TODO Auto-generated method stub
		
		memberMapper.deleteMember(username);
	}

	@Override
	public List<User> getAllMembers() {
		// TODO Auto-generated method stub
		
		return memberMapper.getAllMembers();
	}

	@Override
	public void chengePrivilege(String command, String privilege,String username) {
		// TODO Auto-generated method stub
		if(command.equalsIgnoreCase("ADD"))
		{   
			int tem = Integer.parseInt(privilege)+1;
			if(tem >=3)
			{
				tem--;
			}
			privilege =""+tem;
			privilegeMapper.setPrivilege(privilege, username);
		}
		else if(command.equalsIgnoreCase("REDUCE"))
		{
			int tem = Integer.parseInt(privilege)-1;
			if(tem <=-1)
			{
				tem++;
			}
			privilege =""+tem;
			privilegeMapper.setPrivilege(privilege, username);
		}
	}

	@Override
	public void deleteMembers(String[] username) {
		// TODO Auto-generated method stub
		for (String string : username) {
			memberMapper.deleteMember(string);
		}
		
	}

	@Override
	public void storgeInform(Infrom infrom,String scope) {
		// TODO Auto-generated method stub
		Timestamp pubdata = new Timestamp(System.currentTimeMillis());
		String username = CurrentUser.getUser().getUsername();
		infrom.setPubdata(pubdata);
		infrom.setUsername(username);
		infrom.setScope(scope);
		
		infromMapper.insertNotice(infrom);
	}

}
