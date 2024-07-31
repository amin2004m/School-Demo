package com.mydemoproject.mappertask.mapper;


import com.mydemoproject.mappertask.dto.request.TeacherRequest;
import com.mydemoproject.mappertask.dto.response.TeacherResponse;
import com.mydemoproject.mappertask.entity.Teacher;

public class TeacherMapper {

    public static Teacher mapToTeacherEntity(TeacherRequest teacherResponse){
         return Teacher.builder()
                .teacherID(teacherResponse.getTeacherID())
                .name(teacherResponse.getName())
                .surname(teacherResponse.getSurname())
                .age(teacherResponse.getAge())
                .subject(teacherResponse.getSubject())
                .build();

    }
    public static TeacherResponse mapToTeacherResponse(Teacher teacher){
        return TeacherResponse.builder()
                .teacherID(teacher.getTeacherID())
                .name(teacher.getName())
                .surname(teacher.getSurname())
                .age(teacher.getAge())
                .subject(teacher.getSubject())
                .build();
    }
}
