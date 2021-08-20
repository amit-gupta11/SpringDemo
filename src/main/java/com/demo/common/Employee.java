package com.demo.common;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }


    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
