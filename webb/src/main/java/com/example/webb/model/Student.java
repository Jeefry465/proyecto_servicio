package com.example.webb.model;

import java.time.LocalDate;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;
    private LocalDate birthDate;

    // Constructor vacío
    public Student() {}

    // Constructor con parámetros
    public Student(String id, String name, String email, int age, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.birthDate = birthDate;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
