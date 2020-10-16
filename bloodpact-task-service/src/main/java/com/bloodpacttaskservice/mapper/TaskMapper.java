package com.bloodpacttaskservice.mapper;

import com.bloodpacttaskservice.dto.TaskDto;
import com.bloodpacttaskservice.model.Task;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskMapper {

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    public Task mapDtoToTask(TaskDto taskDto) {
        mapperFactory.classMap(TaskDto.class, Task.class)
                .field("id", "id")
                .field("userId", "userId")
                .field("pactId", "pactId")
                .field("status", "status")
                .field("punishment", "punishment")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        Task taskToReturn = mapper.map(taskDto, Task.class);
        return taskToReturn;
    }

    public TaskDto mapTaskToDto(Task task) {
        mapperFactory.classMap(Task.class, TaskDto.class)
                .field("id", "id")
                .field("userId", "userId")
                .field("pactId", "pactId")
                .field("status", "status")
                .field("punishment", "punishment")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        TaskDto dtoToReturn = mapper.map(task, TaskDto.class);
        return dtoToReturn;
    }

}
