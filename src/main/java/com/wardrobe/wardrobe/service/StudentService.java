package com.wardrobe.wardrobe.service;

import com.wardrobe.wardrobe.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
