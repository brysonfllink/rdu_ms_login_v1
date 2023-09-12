package com.linktic.login.mapper;

import com.linktic.login.dto.ResourceProfilesDTO;
import com.linktic.login.model.ResourceProfiles;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IResourceProfilesMapper {

    ResourceProfilesDTO resourceProfilesToResourceProfilesDTO(ResourceProfiles resourceProfiles);

    List<ResourceProfilesDTO> resourcesProfilesToResourcesProfilesDTOList(List<ResourceProfiles> resourceProfiles);

}
