package com.hrishikesh.todo.controller;

import com.hrishikesh.todo.model.Todo;
import com.hrishikesh.todo.repository.ITodoRepository;
import com.hrishikesh.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // @Controller + @ResponseBddy
@RequestMapping("api/v1/ToDo/")
public class ToDoController {
    @Autowired
    private ToDoService service;
    @PostMapping("add") //Create
    public String  add(@RequestBody Todo toDo){
        return service.add(toDo);
    }

    @GetMapping("find/id/{id}") //Read
    public Object findById(@PathVariable int id){
        return service.findById(id);
    }

    @GetMapping("findAll") //Read => form service and posting on website
    public List<Todo> findAll(){
        return service.findAll();
    }

    @PutMapping("put/id/{id}") //Update
    public String updateById(@PathVariable int id, @RequestBody Todo toDo){
        return service.updateById(id,toDo);
    }

    @DeleteMapping("delete/id/{id}") //Delete
    public String deleteById(@PathVariable int id){
        return service.deleteById(id);
    }

}
