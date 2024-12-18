package com.covoiturage.voiture.mapper;

import com.covoiturage.voiture.dto.UserDTO;
import com.covoiturage.voiture.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
