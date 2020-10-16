package com.bloodpacttaskservice.service;

import com.bloodpacttaskservice.dto.TaskDto;
import com.bloodpacttaskservice.mapper.TaskMapper;
import com.bloodpacttaskservice.model.Task;
import com.bloodpacttaskservice.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;

    public TaskDto saveTask(TaskDto taskDto) {
        Task task  = taskMapper.mapDtoToTask(taskDto);
        task.setId(UUID.randomUUID());
        return taskMapper.mapTaskToDto(taskRepository.save(task));
    }

    public TaskDto updateTask(TaskDto taskDto) {
        Task task  = taskMapper.mapDtoToTask(taskDto);
        return taskMapper.mapTaskToDto(taskRepository.save(task));
    }

    public TaskDto getTask(UUID id) {
        return taskMapper.mapTaskToDto(taskRepository.getOne(id));
    }


}
