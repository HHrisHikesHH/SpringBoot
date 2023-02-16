package com.hrishikesh.todo.service;

import com.hrishikesh.todo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
public interface ITodDoService {
    public List<ToDo> findAll();
    public ToDo findById(int id);
    public void addTodo(ToDo toDo);
    public void delete(int id);
    public void update(int id, ToDo todo);
}
