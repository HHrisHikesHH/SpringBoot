package com.hrishikesh.todo;

import com.hrishikesh.todo.service.ToDoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
	private static ToDoService service;

	public TodoApplication(ToDoService service) {
		this.service = service;
	}

	public static void main(String[] args) {

			SpringApplication.run(TodoApplication.class, args);
			System.out.println("✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅✅");
//			System.out.println(service.findAll());
	}

}
