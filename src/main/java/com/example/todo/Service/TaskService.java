package com.example.todo.Service;

import com.example.todo.Entity.Task;
import com.example.todo.Repository.TaskRepository;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.logging.Logger;

@Service
public class TaskService {

    private Logger logger = Logger.getLogger(Task.class.getName());

    @Autowired
    TaskRepository repository;

    public Task crete(Task task){
        logger.info("Task Criada");
        return repository.save(task);
    }
    public Task findByID(long id){
        return repository.findById(id).orElse(null);
    }
    public List<Task> findAll(){
        return repository.findAll();
    }
    public void delete(Long id){
        Task task = repository.findById(id).orElseThrow(()->new RuntimeException("Not exist"));
        repository.delete(task);
    }

}
