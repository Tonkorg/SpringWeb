package ru.tyaga.SpringWeb.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor ВСЕ ЭТИ АНОТАЦИИ УЖЕ ВКДЮЧЕНЫ В @DATA

@Data
@Entity
@Table (name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private String firstName;
    private String lastName;
    private LocalDate dateBirth;

    @Transient
    private int age;
    @Column(unique = true)
    private String mail;

    public int getAge()
    {
        return Period.between(dateBirth,LocalDate.now()).getYears();
    }
}
