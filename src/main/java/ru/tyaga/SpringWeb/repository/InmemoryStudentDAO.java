package ru.tyaga.SpringWeb.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.tyaga.SpringWeb.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InmemoryStudentDAO {
    private final  List<Student> STUDENT = new ArrayList();

    public List<Student> findAllStusent(){
        return STUDENT;
    }


    public Student saveStudent(Student student) {
        STUDENT.add(student);
        return student;
    }


    public Student findByEmail(String email) {
        return STUDENT.stream().
                filter(element -> element.getMail().equals(email)).findFirst().orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentindex = IntStream.range(0,STUDENT.size()).
                filter(index -> STUDENT.get(index).getMail().equals(student.getMail()))
                .findFirst().orElse(-1);

        if(studentindex >-1)
        {
            STUDENT.set(studentindex,student);
            return student;
        }
        else return null;


    }


    public void deleteStudent(String email) {

        var student = findByEmail(email);
        if(student!=null)
        {
            STUDENT.remove(student);
        }
    }
}
