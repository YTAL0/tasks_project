package com.example.todo.Controller;

import com.example.todo.Entity.Task;
import com.example.todo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService service;

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Task findByID(@PathVariable("id") Long id){
        return service.findByID(id);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Task create(@RequestBody Task task){
        return service.crete(task);
    }
}
