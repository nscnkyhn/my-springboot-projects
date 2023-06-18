package com.nscnkyhn.roomwebapp.models;

public class StaffModel {
    private int id;
    private String UUID;
    private String name;
    private String surname;
    private String role;
    private int age;
    private boolean isActive;

    public StaffModel() {
    }

    public StaffModel(int id, String UUID, String name, String surname, String role, int age, boolean isActive) {
        this.id = id;
        this.UUID = UUID;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.age = age;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
