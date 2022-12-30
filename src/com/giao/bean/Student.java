package com.giao.bean;

public class Student {
    private int number;
    private String name;
    private String gender;

    public Student() {
    }

    public Student(int number, String name, String gender) {
        this.number = number;
        this.name = name;
        this.gender = gender;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
