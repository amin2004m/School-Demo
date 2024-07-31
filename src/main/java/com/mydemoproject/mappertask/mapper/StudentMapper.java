package com.mydemoproject.mappertask.mapper;

import com.mydemoproject.mappertask.dto.request.StudentRequest;
import com.mydemoproject.mappertask.dto.response.StudentResponse;
import com.mydemoproject.mappertask.entity.Student;

public class StudentMapper {

    public static Student mapToStudentEntity(StudentRequest studentRequest) {
        Student student = Student.builder()
                .id(studentRequest.getId())
                .name(studentRequest.getName())
                .surname(studentRequest.getSurname())
                .age(studentRequest.getAge())
                .CGPA(studentRequest.getCGPA())
                .dateOfBirth(studentRequest.getDateOfBirth())
                .build();

        return student;
    }

    public static StudentResponse mapToStudentResponse(Student student) {

        StudentResponse studentResponse = StudentResponse.builder()
                .id(student.getId())
                .name(student.getName())
                .surname(student.getSurname())
                .age(student.getAge())
                .CGPA(student.getCGPA())
                .dateOfBirth(student.getDateOfBirth())
                .build();

        return studentResponse;

    }
}
