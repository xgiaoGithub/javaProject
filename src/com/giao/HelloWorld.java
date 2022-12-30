package com.giao;

import com.giao.bean.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world...");
        System.out.println("i am new man");
        Student student = new Student();
        student.setNumber(001);
        student.setName("张三");
        student.setGender("women");

        System.out.println(student);
    }
}

