package com.Hrishikesh.Mapping.service;

import com.Hrishikesh.Mapping.model.Laptop;
import com.Hrishikesh.Mapping.model.Student;
import com.Hrishikesh.Mapping.repository.LaptopRepository;
import com.Hrishikesh.Mapping.repository.StudentRepository;
import org.aspectj.weaver.reflect.IReflectionWorld;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    StudentRepository StudentRepository;
    @Autowired
    LaptopRepository repository;
    public String saveLaptop(Laptop laptop, Integer studentId) {
        String response = null;
        if(!StudentRepository.existsById(studentId)){
            Student student = StudentRepository.findById(studentId).get();
            laptop.setStudent(student);
            repository.save(laptop);
            response = laptop.getName();
        }
        return response;
    }
    public JSONArray getLaptop(Integer laptopId, Integer studentId) throws JSONException {
        JSONArray laptops = new JSONArray();
        if(studentId == null && laptopId != null && repository.existsById(laptopId)){
            Laptop laptop = repository.findById(laptopId).get();
            JSONObject laptopObj = this.jsonObjectToLaptop(laptop);
            laptops.put(laptopObj);
        } else if(studentId != null) {
            List<Laptop> laptopList = repository.findAll();
            for(Laptop laptop: laptopList) {
                if(laptop.getStudent().getStudentId().equals(studentId)){
                    JSONObject laptopObj = this.jsonObjectToLaptop(laptop);
                    laptops.put(laptopObj);
                }
            }
        } else{
            List<Laptop> laptopList = repository.findAll();
            for(Laptop laptop: laptopList) {
                JSONObject laptopObj = this.jsonObjectToLaptop(laptop);
                laptops.put(laptopObj);
            }
        }
        return laptops;
    }
    private JSONObject jsonObjectToLaptop(Laptop laptop) throws JSONException {
        JSONObject obj = new JSONObject();
        obj.put("laptopId", laptop.getLaptopId());
        obj.put("name", laptop.getName());
        obj.put("brand", laptop.getBrand());
        obj.put("price", laptop.getPrice());
        return obj;
    }
    public String updateLaptop(Integer laptopId) {
        String response = null;
        if(repository.existsById(laptopId)){
            response = repository.findById(laptopId).get().getName();
        }
        return response;
    }
}
