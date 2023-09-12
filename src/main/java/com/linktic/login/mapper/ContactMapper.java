package com.linktic.login.mapper;

import com.linktic.login.dto.ContactDTO;
import com.linktic.login.model.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ContactMapper implements IContactMapper {

    private final ICompanyMapper companyMapper;

    @Override
    public ContactDTO contactToContactDTO(Contact contact) {
        if (contact == null)
            return null;

        return ContactDTO.builder()
                .fullName(contact.getFullName())
                .jobTitle(contact.getJobTitle())
                .company(companyMapper.companyToCompanyDTO(contact.getCompany()))
                .build();
    }
}
