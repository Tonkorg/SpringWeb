package ru.tyaga.SpringWeb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tyaga.SpringWeb.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    void deleteByMail(String mail);

    Student findByMail(String mail);
}
