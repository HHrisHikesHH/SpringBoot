package com.hrishikesh.todo.service;

import com.hrishikesh.todo.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToDoService {
    private static final List<ToDo> todos = new ArrayList<>(); // Acting as Local DataBase
    private static int todocount = 0;

    static{

        todos.add(new ToDo(++todocount, "Wake up", false));
        todos.add(new ToDo(++todocount, "Hydrate", false));
        todos.add(new ToDo(++todocount, "Meditate", false));
        todos.add(new ToDo(++todocount, "Stretch & Exercise", false));
        todos.add(new ToDo(++todocount, "Study", false));

    }

    public List<ToDo> findAll(){
        return todos;
    }

    public ToDo findById(int id) {
        for(ToDo todo : todos)
            if(todo.getId() == id)
                return todo;
        return new ToDo(-1, "TASK NOT FOUND", true);
    }

    public void addTodo(ToDo toDo){
        todos.add(toDo);
    }

    public void delete(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public void update(int id, ToDo todo) {
        for(ToDo toDo: todos){
            if(toDo.getId() == id){
                toDo.setId(todo.getId());
                toDo.setTitle(todo.getTitle());
                toDo.setStatus(todo.getStatus());
            }
        }
    }
}
