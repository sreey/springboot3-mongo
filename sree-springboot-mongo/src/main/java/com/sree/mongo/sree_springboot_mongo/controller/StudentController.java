package com.sree.mongo.sree_springboot_mongo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sree.mongo.sree_springboot_mongo.entity.Student;
import com.sree.mongo.sree_springboot_mongo.service.StudentService;

import lombok.RequiredArgsConstructor;



@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class StudentController {
    
    private final StudentService studentService;

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
    @GetMapping("/students/{studentId}")
    public Student getStudentsById(@PathVariable String studentId) {
        return studentService.getStudentsById(studentId);
    }

    @GetMapping(value="/students", params = {"age", "name"})
    public List<Student> getStudentsByAgeAndName(@RequestParam Integer age, @RequestParam String name) {
        return studentService.getStudentsByAgeAndName(age, name);
    }

    @DeleteMapping("/students/{studentId}")
    public String deleteStudentById(@PathVariable String studentId){
        studentService.deleteStudentById(studentId);
        return "Student record with Id:-{"+studentId+"} deleted successfully";
    }

    
    @GetMapping(value="/students", params = {"page", "size"})
    public List<Student> getStudentsByPagination(@RequestParam Integer page, @RequestParam Integer size) {
        return studentService.getStudentsByPagination(page, size);
    }


    @GetMapping(value="/students", params = {"sort", "order"})
    public List<Student> getStudentsBySorting(@RequestParam String sort, @RequestParam Integer order) {
        return studentService.getStudentsBySorting(sort, order);
    }

    
}
