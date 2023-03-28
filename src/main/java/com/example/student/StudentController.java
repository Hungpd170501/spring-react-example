package com.example.student;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private Faker faker;

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                Student.builder()
                        .id(1L)
                        .email(faker.internet().emailAddress())
                        .gender(Gender.MALE)
                        .name(faker.name().name())
                        .build(),
                Student.builder()
                        .id(2L)
                        .email(faker.internet().emailAddress())
                        .gender(Gender.MALE)
                        .name(faker.name().name())
                        .build(),
                Student.builder()
                        .id(3L)
                        .email(faker.internet().emailAddress())
                        .gender(Gender.MALE)
                        .name(faker.name().name())
                        .build(),
                Student.builder()
                        .id(4L)
                        .email(faker.internet().emailAddress())
                        .gender(Gender.MALE)
                        .name(faker.name().name())
                        .build()
        );
        return students;
    }
}
