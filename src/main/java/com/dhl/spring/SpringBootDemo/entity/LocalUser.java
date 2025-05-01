// src/main/java/com/example/demo/model/LocalUser.java
package com.dhl.spring.SpringBootDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LocalUser")
public class LocalUser {
    @Id
    @GeneratedValue
    private Integer userId;

    private String username;

    private String fullName;

    private Integer salary;

    public LocalUser() {}

    public LocalUser(Integer id, String username, String fullName, Integer salary) {
        this.userId = id;
        this.username= username;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
