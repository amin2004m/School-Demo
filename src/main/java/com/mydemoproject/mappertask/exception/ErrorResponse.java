package com.mydemoproject.mappertask.exception;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ErrorResponse {

    String uuid;
    String errorCode;
    String errorMessage;
    List<FieldError> fieldErrors;

}
