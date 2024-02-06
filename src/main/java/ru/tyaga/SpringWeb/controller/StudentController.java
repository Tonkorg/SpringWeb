package ru.tyaga.SpringWeb.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.tyaga.SpringWeb.model.Student;
import ru.tyaga.SpringWeb.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {


    @Qualifier("inMemoryStudentServiceImpl")
    private final StudentService service ;

    @GetMapping
    public List<Student> findAllStusent()
    {
       //service.saveStudent(Student.builder().firstName("Tom").lastName("Lange").age(21).mail("Thomasvill16@inbox.ru").dateBirth(LocalDate.of(2002,06,01)).build());
        return service.findAllStusent();
    }
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student)
    {
        service.saveStudent(student);
        return "success";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email)
    {
        return service.findByEmail(email);
    }

    @PutMapping("/update-student")
    public Student updateStudent( @RequestBody Student student)
    {
        return service.updateStudent(student);
    }


    @DeleteMapping("/delete-student/{email}")
    public void deleteStudent(@PathVariable String email)
    {
        service.deleteStudent(email);
    }


}
