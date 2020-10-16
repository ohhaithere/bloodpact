package com.bloodpacttaskservice.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

@Data
public class TaskDto {

    @NotBlank(message = "Name is mandatory")
    private UUID id;
    private UUID userId;
    private UUID pactId;
    private String status;
    private String punishment;

}
