package com.covoiturage.cvtrg.service;

import com.covoiturage.cvtrg.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {


    UserDto createUser(UserDto userdto);

    UserDto getUserByID(Long userId);
}
