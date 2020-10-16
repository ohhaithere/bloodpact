package com.ohhaithere.bloodpactpactservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Pact {

    @Id
    UUID id;
    UUID user1;
    UUID user2;
    String name;

}
