package com.demo.common;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public Employee(String firstName, String lastName, int age, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    public String toString() {
        return "Employee Name is" + " " + firstName + " " + lastName + " and employee Age is " + age
                + " years, lives in " + country;
    }
}
