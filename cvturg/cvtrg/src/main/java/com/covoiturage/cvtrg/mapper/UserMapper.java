package com.covoiturage.cvtrg.mapper;

import com.covoiturage.cvtrg.dto.UserDto;
import com.covoiturage.cvtrg.entity.User;


public class UserMapper {
    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole(),
                user.getRating()
        );
    }
    public static User mapToUser(UserDto userdto){
        return new User(
                userdto.getId(),
                userdto.getName(),
                userdto.getEmail(),
                userdto.getRole(),
                userdto.getRating()
        );
    }
}