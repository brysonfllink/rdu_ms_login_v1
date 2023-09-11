package com.linktic.login.mapper;

import com.linktic.login.dto.ResourceProfilesDTO;
import com.linktic.login.model.ResourceProfiles;
import org.mapstruct.Mapper;

@Mapper
public interface IResourceProfilesMapper {

    ResourceProfilesDTO resourceProfilesToResourceProfilesDTO(ResourceProfiles resourceProfiles);

}
