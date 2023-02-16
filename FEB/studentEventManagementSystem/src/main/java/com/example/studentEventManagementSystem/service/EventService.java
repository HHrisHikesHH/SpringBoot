package com.example.studentEventManagementSystem.service;

import com.example.studentEventManagementSystem.model.Event;
import com.example.studentEventManagementSystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {
//    private static List<Event> events = new ArrayList<>();
//    private static int id = 0;

//    static{
//        events.add(new Event(++id, "Carnival", "College Ground", "22-12-2023", "16:00", "21:00"));
//        events.add(new Event(++id, "Dance Competition", "College Seminar Hall", "23-12-2023", "10:00", "16:00"));
//        events.add(new Event(++id, "Project Competition", "Department Seminar Hall", "23-12-2023", "9:00", "14:00"));
//        events.add(new Event(++id, "Sports", "College Ground", "22-12-2023", "7:00", "18:00"));
//        events.add(new Event(++id, "Excursion", "IUCAA", "23-12-2023", "6:00", "18:00"));
//    }

    @Autowired
    EventRepository repository;

    public String addEvent(Event event) {
        repository.save(event);
        return "Event " + event.getEventName() + " Added Successfully!";
    }

    public String UpdateEvent(Event newEvent, String name) {
        List<Event> events = getAll();
        for (Event event: events) {
            if(event.getEventName().equals(name)){
                repository.delete(event);
                return "Event " + name+ " Updated Successfully!";
            }
        }
        return "Event " + name + " Not Found! Please Add Event first";
    }

    public String deleteEvent(String name) {
        List<Event> events = getAll();
        for (Event event: events) {
            if(event.getEventName().equals(name)){
                repository.delete(event);
                return "Event " + name+ " Deleted Successfully!";
            }
        }
        return "Event " + name + " Not Found! Please Add Event first";
    }

    public List<Event> getAll() {
        return repository.findAll();
    }

    public List<Event> getBydate(String date) {
        List<Event> byDates = new ArrayList<>();
        List<Event> events = getAll();
        for (Event event: events) {
            if(event.getDate().equals(date)){
                byDates.add(event);
            }
        }
        return byDates;
    }
}
