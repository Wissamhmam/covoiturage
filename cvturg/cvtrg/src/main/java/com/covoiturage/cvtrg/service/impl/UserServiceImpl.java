package com.covoiturage.cvtrg.service.impl;

import com.covoiturage.cvtrg.dto.UserDto;
import com.covoiturage.cvtrg.entity.User;
import com.covoiturage.cvtrg.exception.ResourceNotFoundException;
import com.covoiturage.cvtrg.mapper.UserMapper;
import com.covoiturage.cvtrg.repository.UserRepository;
import com.covoiturage.cvtrg.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto userdto) {
        User user = UserMapper.mapToUser(userdto);
        User savedUser =userRepository.save(user);

        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserByID(Long userId) {
       User user= userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User in not exists with given id:" + userId));

        return UserMapper.mapToUserDto(user);
    }
}
