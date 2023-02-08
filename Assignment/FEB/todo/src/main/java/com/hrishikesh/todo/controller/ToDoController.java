package com.hrishikesh.todo.controller;

import com.hrishikesh.todo.model.ToDo;
import com.hrishikesh.todo.service.ToDoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
@RestController // @Controller + @ResponseBddy
@RequestMapping("api/v1/ToDo/")
public class ToDoController {

//    @RequestMapping("msg")
////    @ResponseBody
//    public String getMessage(){
//        return "Namaste";
//    }

//    url -> http://localhost:8080/api?username=Hrishikesh
//    @RequestMapping("/api")
//    public String getMessage(@RequestParam String username){
//        return "hello " + username + " sir!";
//    }

////    url -> http://localhost:8080/api/username/Hrishikesh
//    @RequestMapping("/api/username/{username}")
//    public String getMessage(@PathVariable String username){
//        return "hello " + username + " sir!";
//    }


//    url -> http://localhost:8080/api?username=Hrishikesh&age=25&sex=male&personality=Great
//    @RequestMapping("/api")
//    public String getMessage(@RequestParam String username, @RequestParam int age, @RequestParam String sex, @RequestParam String personality){
//        return "Hello " + username + " sir!\n" + "Your age seems " + age + "yr\n" +
//                "And you looks a healthy " + sex + "\n" + "you must be having a " + personality + " personality";
//    }

    //    url -> http://localhost:8080/api/username/Hrishikesh/age/25/sex/male/personality/Great
//    @RequestMapping("/api/username/{username}/age/{age}/sex/{sex}/personality/{personality}")
//    public String getMessage(@PathVariable String username, @PathVariable int age, @PathVariable String sex, @PathVariable String personality){
//        return "Hello " + username + " sir!\n" + "Your age seems " + age + "yr\n" +
//                "And you looks a healthy " + sex + "\n" + "you must be having a " + personality + " personality";
//    }

    private final ToDoService service;

    public ToDoController(ToDoService service) {
        this.service = service;
    }

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
