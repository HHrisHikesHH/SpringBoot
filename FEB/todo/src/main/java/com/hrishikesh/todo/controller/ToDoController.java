package com.hrishikesh.todo.controller;

import com.hrishikesh.todo.model.ToDo;
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
    public void addToDo(@RequestBody ToDo toDo){
        service.addTodo(toDo);
    }

    @GetMapping("find/id/{id}") //Read
    public ToDo findToDoById(@PathVariable int id){
        return service.findById(id);
    }

    @GetMapping("findAll") //Read => form service and posting on website
    public List<ToDo> findAllToDos(){
        return service.findAll();
    }

    @PutMapping("put/id/{id}") //Update
    public void updateToDo(@PathVariable int id, @RequestBody ToDo toDo){
        service.update(id,toDo);
    }

    @DeleteMapping("delete/id/{id}") //Delete
    public void deleteToDoById(@PathVariable int id){
        service.delete(id);
    }

}
