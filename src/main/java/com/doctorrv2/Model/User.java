package com.doctorrv2.Model;

public class User {

    private int Id;
    private String FullName;
    private String email;
    private String password;
    private String phone;
    private String Role;
    private String Specialization;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public User(String fullName, String email, String password, String phone, String role, String specialization) {
        FullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        Role = role;
        Specialization = specialization;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public User(int id, String fullName, String email, String password, String phone, String role, String specialization) {
        Id = id;
        FullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        Role = role;
        Specialization = specialization;
    }
    public User() {}
}
