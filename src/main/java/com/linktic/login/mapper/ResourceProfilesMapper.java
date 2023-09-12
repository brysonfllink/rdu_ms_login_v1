package com.linktic.login.mapper;

import com.linktic.login.dto.ResourceProfilesDTO;
import com.linktic.login.model.ResourceProfiles;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ResourceProfilesMapper implements IResourceProfilesMapper {

    @Override
    public ResourceProfilesDTO resourceProfilesToResourceProfilesDTO(ResourceProfiles resourceProfiles) {
        if (resourceProfiles == null)
            return null;

        return ResourceProfilesDTO.builder()
                .profileName(resourceProfiles.getProfileName())
                .build();
    }

    @Override
    public List<ResourceProfilesDTO> resourcesProfilesToResourcesProfilesDTOList(List<ResourceProfiles> resourceProfiles) {
        return resourceProfiles.stream()
                .map(this::resourceProfilesToResourceProfilesDTO)
                .collect(Collectors.toList());
    }
}
