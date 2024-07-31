package com.mydemoproject.mappertask.controller;

import com.mydemoproject.mappertask.dto.request.TeacherRequest;
import com.mydemoproject.mappertask.dto.response.TeacherResponse;
import com.mydemoproject.mappertask.service.TeacherService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/teachers")
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TeacherController {

    TeacherService teacherService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TeacherResponse> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public TeacherResponse findTeacherById(@PathVariable Long id) {
        return teacherService.findTeacherById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherResponse createTeacher(@RequestBody TeacherRequest teacherRequest) {
        return teacherService.createTeacher(teacherRequest);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeacherById(@PathVariable Long id) {
        teacherService.deleteTeacherById(id);
    }

}
