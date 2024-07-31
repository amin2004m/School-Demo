package com.mydemoproject.mappertask.mapper;


import com.mydemoproject.mappertask.dto.request.TeacherRequest;
import com.mydemoproject.mappertask.dto.response.TeacherResponse;
import com.mydemoproject.mappertask.entity.Teacher;

public class TeacherMapper {

    public static Teacher mapToTeacherEntity(TeacherRequest teacherResponse){
        Teacher teacher = Teacher.builder()
                .teacherID(teacherResponse.getTeacherID())
                .name(teacherResponse.getName())
                .surname(teacherResponse.getSurname())
                .age(teacherResponse.getAge())
                .subject(teacherResponse.getSubject())
                .build();
        return teacher;
    }
    public static TeacherResponse mapToTeacherResponse(Teacher teacher){
        TeacherResponse teacherResponse = TeacherResponse.builder()
                .teacherID(teacher.getTeacherID())
                .name(teacher.getName())
                .surname(teacher.getSurname())
                .age(teacher.getAge())
                .subject(teacher.getSubject())
                .build();
        return teacherResponse;
    }
}
