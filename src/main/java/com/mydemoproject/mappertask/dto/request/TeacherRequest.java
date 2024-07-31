package com.mydemoproject.mappertask.dto.request;

import lombok.Data;

@Data
public class TeacherRequest {
    Long teacherID;

    String name;
    String surname;
    String subject;
    Integer age;
}
