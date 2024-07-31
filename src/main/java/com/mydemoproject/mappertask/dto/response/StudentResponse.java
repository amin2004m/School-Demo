package com.mydemoproject.mappertask.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentResponse {
    Long id;

    String name;
    String surname;
    Integer age;
    String dateOfBirth;
    Double CGPA;
}
