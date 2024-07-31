package com.mydemoproject.mappertask.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherResponse {
    Long teacherID;

    String name;
    String surname;
    String subject;
    Integer age;
}
