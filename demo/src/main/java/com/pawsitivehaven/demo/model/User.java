package com.pawsitivehaven.demo.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "First name is required")
    @Size(min = 2, message = "First name should have at least 2 characters")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Size(min = 2, message = "First name should have at least 2 characters")
    private String lastName;

    @NotEmpty(message = "Nickname is required")
    private String nickname;

    @NotEmpty(message = "Date of birth  is required")
    private Date birthDate;

    @NotEmpty(message = "Area place is required")
    private String areaPlace;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email should be valid")
    @Column(unique = true)
    private String email;

}
