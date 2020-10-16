package com.ohhaithere.bloodpactuserservice.mapper;

import com.ohhaithere.bloodpactuserservice.dto.UserDto;
import com.ohhaithere.bloodpactuserservice.model.User;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();


    public User mapUserDtoToUser(UserDto userDto) {
        mapperFactory.classMap(UserDto.class, User.class)
                .field("id", "id")
                .field("name", "name")
                .field("email", "email")
                .field("password", "password")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        User userToReturn = mapper.map(userDto, User.class);
        return userToReturn;
    }

    public UserDto mapUserToUserDto(User user) {
        mapperFactory.classMap(User.class, UserDto.class)
                .field("id", "id")
                .field("name", "name")
                .field("email", "email")
                .field("password", "password")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        UserDto userToReturn = mapper.map(user, UserDto.class);
        return userToReturn;
    }

}
