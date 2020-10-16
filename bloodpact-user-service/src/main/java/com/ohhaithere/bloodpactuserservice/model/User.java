package com.ohhaithere.bloodpactuserservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class User {

    @Id
    UUID uuid;
    String name;
    String email;
    String password;

}
