package com.wardrobe.wardrobe.controller;

import com.wardrobe.wardrobe.model.Student;
import com.wardrobe.wardrobe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student was added";
    }

    @GetMapping("/all")
    public List<Student> add(){
        return studentService.getAllStudents();
    }


}
