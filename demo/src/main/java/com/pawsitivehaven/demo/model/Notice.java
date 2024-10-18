package com.pawsitivehaven.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name is required")
    @Size(min = 2, message = "Name should have at least 2 characters")
    private String animalName;

    @NotEmpty(message = "Animal age is required")
    private int animalAge;

    @NotEmpty(message = "Animal type is required")
    private String animalType;

    private String medicalDocuments;

    @NotEmpty(message = "Descriptione is required")
    @Size(min = 15, message = "Description should have at least 15 characters")
    private String description;

    private String additionCare;

    private String specialNote;

}
