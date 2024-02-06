package ru.tyaga.SpringWeb.service.imp;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.tyaga.SpringWeb.model.Student;
import ru.tyaga.SpringWeb.repository.InmemoryStudentDAO;
import ru.tyaga.SpringWeb.service.StudentService;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {


    private final InmemoryStudentDAO dao;
    @Override
    public List<Student> findAllStusent() {
        return dao.findAllStusent();
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
        return dao.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return dao.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
            dao.deleteStudent(email);
    }
}
