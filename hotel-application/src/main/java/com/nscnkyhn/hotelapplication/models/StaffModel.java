package com.nscnkyhn.hotelapplication.models;

public class StaffModel {
    private int ID;
    private String role;
    private String name;
    private String surname;
    private String email;
    private int age;
    private String gender;
    private String status;
    public StaffModel() {
    }

    public StaffModel(int ID, String role, String name, String surname, String email, int age, String gender, String status) {
        this.ID = ID;
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
