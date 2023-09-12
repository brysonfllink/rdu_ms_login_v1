package com.linktic.login.mapper;

import com.linktic.login.dto.ContactDTO;
import com.linktic.login.model.Contact;
import org.mapstruct.Mapper;

@Mapper
public interface IContactMapper {

    ContactDTO contactToContactDTO(Contact contact);

}
