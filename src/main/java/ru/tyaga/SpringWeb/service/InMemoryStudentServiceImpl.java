package ru.tyaga.SpringWeb.service;

import org.springframework.stereotype.Service;
import ru.tyaga.SpringWeb.model.Student;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentServiceImpl implements StudentService{

    @Override
    public List<Student> findAllStusent() {
        return null;
//                List.of(
//
//                Student.builder().
//                        firstName("Tom").
//                        lastName("Lange").
//                        dateBirth(LocalDate.of(2023,12,11)).
//                        age(32).
//                        mail("TLange@example.com").
//                        build()
//        );
    }

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteStudent(String email) {

    }
}
