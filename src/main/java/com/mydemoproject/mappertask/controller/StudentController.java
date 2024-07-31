package com.mydemoproject.mappertask.controller;


import com.mydemoproject.mappertask.dto.request.StudentRequest;
import com.mydemoproject.mappertask.dto.response.StudentResponse;
import com.mydemoproject.mappertask.service.StudentService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/students")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class StudentController {
    StudentService studentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentResponse> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public StudentResponse registerStudent(@RequestBody StudentRequest studentRequest) {
        return studentService.registerStudent(studentRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public StudentResponse findStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable Long id) {
        studentService.deleteStudentById(id);
    }
}
