package com.ohhaithere.bloodpactuserservice.service;

import com.ohhaithere.bloodpactuserservice.dto.UserDto;
import com.ohhaithere.bloodpactuserservice.mapper.UserMapper;
import com.ohhaithere.bloodpactuserservice.model.User;
import com.ohhaithere.bloodpactuserservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto saveUser(UserDto user) {
        User userToSave = userMapper.mapUserDtoToUser(user);
        user.setUuid(UUID.randomUUID());

        userRepository.save(userToSave);
        return userMapper.mapUserToUserDto(userToSave);
    }

    public UserDto updateUser(UserDto user) {
        User userToUpdate = userMapper.mapUserDtoToUser(user);
        userRepository.save(userToUpdate);
        return userMapper.mapUserToUserDto(userToUpdate);
    }

    public UserDto getUser(UUID id) {
        return userMapper.mapUserToUserDto(userRepository.getOne(id));
    }

}
