package com.linktic.login.mapper;

import org.mapstruct.Mapper;

import com.linktic.login.model.LogLogin;
import com.linktic.login.request.LoginDTO;

@Mapper
public interface ILogLoginMapper {
	
	LogLogin loginDTOToLogLogin(LoginDTO login);

}
