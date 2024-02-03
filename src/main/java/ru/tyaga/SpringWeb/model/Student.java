package ru.tyaga.SpringWeb.model;

import lombok.*;

import java.time.LocalDate;


//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor ВСЕ ЭТИ АНОТАЦИИ УЖЕ ВКДЮЧЕНЫ В @DATA

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;

    private int age;
    private String mail;
}
