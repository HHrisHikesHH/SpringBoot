package com.hrishikesh.todo.service;

import com.hrishikesh.todo.model.Todo;

import java.util.List;
public interface ITodDoService {
    public List<Todo> findAll();
    public Object findById(int id);
    public String add(Todo toDo);
    public String deleteById(int id);
    public String updateById(int id, Todo todo);
}
