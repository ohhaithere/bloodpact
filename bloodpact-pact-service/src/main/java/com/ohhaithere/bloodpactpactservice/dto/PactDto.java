package com.ohhaithere.bloodpactpactservice.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class PactDto {

    UUID id;
    UUID user1;
    UUID user2;
    String name;

}
