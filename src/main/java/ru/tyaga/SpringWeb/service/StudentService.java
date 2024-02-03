package ru.tyaga.SpringWeb.service;

import org.springframework.stereotype.Service;
import ru.tyaga.SpringWeb.model.Student;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStusent();


    Student saveStudent(Student student);

    Student findByEmail(String email);

    Student updateStudent(Student student);

    void deleteStudent(String email);

}
