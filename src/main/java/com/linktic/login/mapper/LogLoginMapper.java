package com.linktic.login.mapper;

import org.springframework.stereotype.Component;

import com.linktic.login.model.LogLogin;
import com.linktic.login.request.LoginDTO;

@Component
public class LogLoginMapper implements ILogLoginMapper {

	@Override
	public LogLogin loginDTOToLogLogin(LoginDTO login) {
		if (login == null)
			return null;
		
		LogLogin logLogin = new LogLogin();
		
		logLogin.setUsername(login.getUsername());
		logLogin.setProfile(login.getProfile());
		
		return logLogin;
	}

}
