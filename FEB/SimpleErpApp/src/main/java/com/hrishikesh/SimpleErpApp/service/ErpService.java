package com.hrishikesh.SimpleErpApp.service;

import com.hrishikesh.SimpleErpApp.dto.StudentPercentageDto;
import com.hrishikesh.SimpleErpApp.model.Student;
import jdk.jfr.Percentage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ErpService {
    private static final List<Student> students = new ArrayList<>();

    static {

        students.add(new Student(1, "Hrishikesh", List.of(7,8,9,6,5), "Pune", "male"));
        students.add(new Student(2, "Aniket", List.of(7,3,6,5,5), "Nashik", "male"));
        students.add(new Student(3, "Prachi", List.of(7,8,9,6,5), "Pimpri", "female"));
        students.add(new Student(4, "Sumit", List.of(3,2,4,3,2), "Mumbai", "male"));
        students.add(new Student(5, "Priya", List.of(6,5,3,6,5), "Aurangabad", "female"));
    }

    public String addStudent(Student student) {
        students.add(student);
        return "Student " + student.getName() + " Added Successfully!!";
    }

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(int id) {
        for(Student student: students){
            if(student.getRollNum() == id) return student;
        }
        return null;
    }

    public Student getStudent(String name) {
        for(Student student: students){
            if(student.getName().equals(name)) return student;
        }
        return null;
    }

    public String updateStudent(Student newStudent, String name) {
        for(Student student: students){
            if(student.getName().equals(name)) {
                if(newStudent.getCity() != null)
                    student.setCity(newStudent.getCity());
                if(newStudent.getMarks() != null)
                    student.setMarks(newStudent.getMarks());
                if(newStudent.getRollNum() != 0)
                    student.setRollNum(newStudent.getRollNum());
                if(newStudent.getGender() != null)
                    student.setGender(newStudent.getGender());
                return "Student " + name + " Update Successfully!!";
            }
        }
        return "Student Not Found";
    }
    public String updateStudent(Student newStudent, int id) {
        for(Student student: students){
            if(student.getRollNum() == id) {
                if(newStudent.getCity() != null)
                    student.setCity(newStudent.getCity());
                if(newStudent.getMarks() != null)
                    student.setMarks(newStudent.getMarks());
                if(newStudent.getName() != null)
                    student.setName(newStudent.getName());
                if(newStudent.getGender() != null)
                    student.setGender(newStudent.getGender());
                return "Student " + id + " Update Successfully!!";
            }
        }
        return "Student Not Found";
    }

    public String deleteStudent(String name) {
        for(int idx = 0; idx < students.size(); idx++){
            if(students.get(idx).getName().equals(name)) {
                students.remove(idx);
                return "Student " + name + " Deleted Successfully!!";
            }
        }
        return "Student Not Found";
    }

    public String deleteStudent(int id) {
        for(int idx = 0; idx < students.size(); idx++){
            if(students.get(idx).getRollNum() == id) {
                students.remove(idx);
                return "Student " + id + " Deleted Successfully!!";
            }
        }
        return "Student Not Found";
    }

    public List<StudentPercentageDto> getPercentages() {
        List<StudentPercentageDto> percentages = new ArrayList<>();
        for(Student student: students) {
            int total = 0;
            double percent = 1.0;
            for (int mark : student.getMarks()) {
                total += mark;
            }
            percent = total / student.getMarks().size() * 10;
            percentages.add(new StudentPercentageDto(student.getName(), total, percent));
        }
        return percentages;
    }

    public StudentPercentageDto getPercentage(String name) {
        List<StudentPercentageDto> percentages = getPercentages();
        for(StudentPercentageDto student: percentages) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public Student getTopper() {
        List<StudentPercentageDto> percentages = getPercentages();
        String name = null;
        double percentage = 0.0;
        for(StudentPercentageDto student: percentages) {
            if(percentage < student.getPercentage()){
                percentage = student.getPercentage();
                name = student.getName();
            }
        }
        return getStudent(name);
    }
    public Student getLoser() {
        List<StudentPercentageDto> percentages = getPercentages();
        String name = null;
        double percentage = 100.0;
        for(StudentPercentageDto student: percentages) {
            if(percentage > student.getPercentage()){
                percentage = student.getPercentage();
                name = student.getName();
            }
        }
        return getStudent(name);
    }
}
