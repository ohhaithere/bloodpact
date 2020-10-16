package com.ohhaithere.bloodpactuserservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class UserDto {

    UUID uuid;
    String name;
    String email;
    String password;

}
