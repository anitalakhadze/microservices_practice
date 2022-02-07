package com.anita.student;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}
