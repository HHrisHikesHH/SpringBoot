package com.hrishikesh.todo.service;

import com.hrishikesh.todo.model.Todo;
import com.hrishikesh.todo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToDoService implements ITodDoService{
    private static final List<Todo> todos = new ArrayList<>(); // Acting as Local DataBase
    private static int todocount = 0;

    @Autowired
    private ITodoRepository iTodoRepository;

    public List<Todo> findAll(){
        return iTodoRepository.findAll();
    }

    public Object findById(int id) {
        return iTodoRepository.findById(id);
    }

    public String add(Todo toDo){
        iTodoRepository.save(toDo);
        return toDo.getTitle() + " - Todo Added";
    }

    public String deleteById(int id) {
        iTodoRepository.deleteById(id);
        return "Todo at " + id + " Deleted";
    }

    public String updateById(int id, Todo todo) {
        this.deleteById(id);
        this.add(todo);
        return todo.getTitle() + " - Todo Updated";
    }
}
