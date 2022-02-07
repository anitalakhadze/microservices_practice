package com.anita.student;

public record StudentRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
