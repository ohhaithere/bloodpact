package com.bloodpacttaskservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Task {

    @Id
    private UUID id;
    private UUID userId;
    private UUID pactId;
    private String status;
    private String punishment;


}
