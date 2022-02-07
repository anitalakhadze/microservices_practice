package com.anita.student;

import org.springframework.stereotype.Service;

@Service
public record StudentService() {
    public void registerStudent(StudentRegistrationRequest request) {
        Student student = Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // TODO: Validate Request
        // TODO: Store Student in DB
    }
}
