package com.hrishikesh.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity // for creating data base with class name
//@Entity(name = "TooDoo") //change the name
public class Todo {
    @Id // making data base entry (primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for auto incrementing
    private int id;
//    @Column(name = "ToDo title") // name change of col in table
    private String title;
    private boolean status;

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", status=" + status +
                '}';
    }


}
