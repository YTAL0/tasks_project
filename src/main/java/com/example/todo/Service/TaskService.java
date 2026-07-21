package com.example.todo.Service;

import com.example.todo.data.v1.Dto.TaskDto;
import com.example.todo.Entity.Task;
import com.example.todo.Mapper.ObjectMapper;
import com.example.todo.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TaskService {

    private Logger logger = Logger.getLogger(TaskDto.class.getName());

    @Autowired
    TaskRepository repository;

    public TaskDto crete(TaskDto TaskDto){
        logger.info("TaskDto Criada");
        var entity = ObjectMapper.parseObject(TaskDto, Task.class);
        return ObjectMapper.parseObject(repository.save(entity), TaskDto.class);
    }
    public TaskDto findByID(long id){
        var a = repository.findById(id).orElse(null);
        return ObjectMapper.parseObject(a, TaskDto.class);
    }
    public List<TaskDto> findAll(){
        var a = repository.findAll();
        return ObjectMapper.parseListObject(a, TaskDto.class);
    }
    public void delete(Long id){
        Task Task = repository.findById(id).orElseThrow(()->new RuntimeException("Not exist"));
        repository.delete(Task);
    }
    public TaskDto update(Long id, TaskDto TaskDto){
        Task entity = repository.findById(id).orElseThrow(()->new  RuntimeException("Not exist"));
        entity.setName(TaskDto.getName());
        entity.setPriority(TaskDto.getPriority());
        entity.setDescription(TaskDto.getDescription());
        entity.setDayWeek(TaskDto.getDayWeek());

        return ObjectMapper.parseObject(repository.save(entity), TaskDto.class);

    }

}
