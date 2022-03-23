package com.example.demo.model;

import com.example.demo.enums.BloodGroup;
import com.example.demo.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document(collection = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private Gender gender;
    private String employeeNumber;
    private BloodGroup bloodGroup;
    private String email;
    private String password;

    public User(String firstName, String lastName, String middleName, String phoneNumber, String email, LocalDate dateOfBirth, Gender gender) {
    }


}
