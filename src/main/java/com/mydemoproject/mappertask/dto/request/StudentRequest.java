package com.mydemoproject.mappertask.dto.request;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StudentRequest {
    Long id;

    String name;
    String surname;
    Integer age;
    String dateOfBirth;
    Double CGPA;
}
