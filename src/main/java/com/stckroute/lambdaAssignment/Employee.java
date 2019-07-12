package com.stckroute.lambdaAssignment;

public class Employee {
    String lastname;
    String name;
    int age;

    @Override
    public String toString() {
        return "Employee{" +
                "lastname='" + lastname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Employee(String lastname, String name, int age) {
        this.lastname = lastname;
        this.name = name;
        this.age = age;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
