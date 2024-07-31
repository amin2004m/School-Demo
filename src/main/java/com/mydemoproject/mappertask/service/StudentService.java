package com.mydemoproject.mappertask.service;

import com.mydemoproject.mappertask.dto.request.StudentRequest;
import com.mydemoproject.mappertask.dto.response.StudentResponse;
import com.mydemoproject.mappertask.entity.Student;
import com.mydemoproject.mappertask.mapper.StudentMapper;
import com.mydemoproject.mappertask.repository.StudentRepo;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class StudentService {

    StudentRepo studentRepo;

    public StudentResponse registerStudent(StudentRequest studentRequest) {

        Student newStudent = StudentMapper.mapToStudentEntity(studentRequest);
        studentRepo.save(newStudent);
        return StudentMapper.mapToStudentResponse(newStudent);
    }
    public List<StudentResponse> getAllStudents(){
        var allUsers = studentRepo.findAll();
        return allUsers.stream().map(StudentMapper::mapToStudentResponse)
                .collect(Collectors.toList());
    }

    public StudentResponse findStudentById(Long id) {

        var user = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        return StudentMapper.mapToStudentResponse(user);
    }
    public void  deleteStudentById(Long id){

        studentRepo.deleteById(id);
    }
}
