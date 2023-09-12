package com.linktic.login.mapper;

import com.linktic.login.dto.SecurityDTO;
import com.linktic.login.model.Security;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityMapper implements ISecurityMapper {

    private final IContactMapper contactMapper;

    @Override
    public SecurityDTO securityToSecurityDTO(Security security) {
        if (security == null)
            return null;

        return SecurityDTO.builder()
                .contact(contactMapper.contactToContactDTO(security.getContact()))
                .build();
    }
}
