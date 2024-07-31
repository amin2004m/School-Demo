package com.mydemoproject.mappertask.service;

import com.mydemoproject.mappertask.dto.request.TeacherRequest;
import com.mydemoproject.mappertask.dto.response.TeacherResponse;
import com.mydemoproject.mappertask.entity.Teacher;
import com.mydemoproject.mappertask.mapper.TeacherMapper;
import com.mydemoproject.mappertask.repository.TeacherRepo;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true,level = AccessLevel.PRIVATE)
public class TeacherService {
    TeacherRepo teacherRepo;

    public List<TeacherResponse> getAllTeachers(){
        return teacherRepo.findAll().stream()
                .map(TeacherMapper::mapToTeacherResponse)
                .collect(Collectors.toList());
    }
    public TeacherResponse createTeacher(TeacherRequest teacherRequest){

        Teacher newTeacher= TeacherMapper.mapToTeacherEntity(teacherRequest);
        teacherRepo.save(newTeacher);
        return TeacherMapper.mapToTeacherResponse(newTeacher);
    }
    public void deleteTeacherById(Long id){
        teacherRepo.deleteById(id);
    }

    public TeacherResponse findTeacherById(Long id){
        var teacher = teacherRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Teacher not found"));
        return TeacherMapper.mapToTeacherResponse(teacher);
    }
}
