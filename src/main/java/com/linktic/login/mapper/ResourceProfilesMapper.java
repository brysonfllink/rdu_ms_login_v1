package com.linktic.login.mapper;

import com.linktic.login.dto.ResourceProfilesDTO;
import com.linktic.login.model.ResourceProfiles;
import org.springframework.stereotype.Component;

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
}
