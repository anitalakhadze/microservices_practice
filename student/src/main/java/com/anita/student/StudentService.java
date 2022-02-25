package com.anita.student;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public record StudentService(StudentRepository studentRepository, RestTemplate restTemplate) {
    public void registerStudent(StudentRegistrationRequest request) {
        Student student = Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // TODO: Validate Request
        studentRepository.saveAndFlush(student);
        PlagiarismCheckResponse plagiarismCheckResponse = restTemplate.getForObject(
                "http://PLAGIARISM/api/v1/plagiarism-check/{studentId}",
                PlagiarismCheckResponse.class,
                student.getId()
        );
        if (plagiarismCheckResponse.isPlagiarist()) {
            throw new IllegalStateException("Student is a plagiarist!");
        }
        // TODO: send notification
    }
}
