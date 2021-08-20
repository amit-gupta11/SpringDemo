package com.demo.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private String fullName;
    private List<String> phones;
    private Set<String> address;
    private Map<String, String> courses;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
    public Employee(String fullName, List<String> phones, Set<String> address, Map<String, String> courses) {
        this.fullName = fullName;
        this.phones = phones;
        this.address = address;
        this.courses = courses;
    }
    public Employee() {

    }
}
