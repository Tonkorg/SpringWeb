package ru.tyaga.SpringWeb.service.imp;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.tyaga.SpringWeb.model.Student;
import ru.tyaga.SpringWeb.repository.StudentRepository;
import ru.tyaga.SpringWeb.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;
    @Override
    public List<Student> findAllStusent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String mail) {
        return repository.findByMail(mail);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Transactional
    @Override
    public void deleteStudent(String mail) {
        repository.deleteByMail(mail);
    }

}
