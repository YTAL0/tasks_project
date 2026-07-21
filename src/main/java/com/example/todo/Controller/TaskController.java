package com.example.todo.Controller;

import com.example.todo.data.Dto.v1.TaskDto;
import com.example.todo.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService service;

    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public TaskDto findByID(@PathVariable("id") Long id){
        return service.findByID(id);
    }
    @GetMapping(value= "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public TaskDto create(@RequestBody TaskDto TaskDto){
        return service.crete(TaskDto);
    }
    @DeleteMapping(value="/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping(value="/update/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public TaskDto update(@PathVariable Long id, @RequestBody TaskDto TaskDto){
        return service.update(id, TaskDto);
    }
}
