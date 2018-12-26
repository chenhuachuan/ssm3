package com.baizhi.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Integer userId;
    private String userName;
    private String password;
    private Double salary;

    public User(Integer userId, String userName, String password, Double salary) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.salary = salary;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
