package com.incture.workorg.employee;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String exp;
    private String designation;

    public Employee(String id, String name, String email, String phone, String exp, String designation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.exp = exp;
        this.designation = designation;
    }

    public Employee() {

    }

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

    public void setEmail(String email) { this.email = email; }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) { this.phone = phone; }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) { this.exp = exp; }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) { this.designation = designation; }

}
