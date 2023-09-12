package com.linktic.login.mapper;

import com.linktic.login.dto.SecurityDTO;
import com.linktic.login.model.Security;
import org.mapstruct.Mapper;

@Mapper
public interface ISecurityMapper {

    SecurityDTO securityToSecurityDTO(Security security);

}
