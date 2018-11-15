package cn.com.iistudio.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;


@Component
@Scope(value=WebApplicationContext.SCOPE_SESSION,proxyMode=ScopedProxyMode.INTERFACES)
public class CurrentUser implements ICurrentUser {

	private User user;

	public void setUser(User user) {
		// TODO Auto-generated method stub
		this.user = user;
    
	}
	public User getUser()
	{
		return user;
	}

}
