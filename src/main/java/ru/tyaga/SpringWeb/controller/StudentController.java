package ru.tyaga.SpringWeb.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tyaga.SpringWeb.model.Student;
import ru.tyaga.SpringWeb.service.StudentService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    @NonNull
   private StudentService service ;

    @GetMapping
    public List<Student> findAllStusent()
    {
        return service.findAllStusent();
    }
}
