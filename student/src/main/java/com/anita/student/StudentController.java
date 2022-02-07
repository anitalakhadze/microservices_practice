package com.anita.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/students")
public record StudentController(StudentService studentService) {

    @PostMapping
    public void registerStudent(@RequestBody StudentRegistrationRequest studentRegistrationRequest) {
        log.info("New Student Registration {}", studentRegistrationRequest);
        studentService.registerStudent(studentRegistrationRequest);
    }
}
