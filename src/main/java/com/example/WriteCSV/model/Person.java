package com.example.WriteCSV.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Age")
    private Integer age;

    @JsonProperty("Location")
    private String location;

    @JsonProperty("Email")
    private String email;

    public Person(String name, Integer age, String location, String email) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
