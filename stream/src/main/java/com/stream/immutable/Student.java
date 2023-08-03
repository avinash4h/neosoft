package com.stream.immutable;

import java.util.Collections;
import java.util.List;

final public class Student {
    private int id;
    private String name;

     private Address address;

    private List<Course> courseList;

    public Student(int id, String name, Address address,List<Course> courseList) {
        this.id = id;
        this.name = name;
        this.address = new Address(address.getCity(), address.getState());
        this.courseList = Collections.unmodifiableList(courseList);
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        //return address;
        //return new Address(address.getCity(),address.getState());
        return Address.getInstance(address);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", courseList=" + courseList +
                '}';
    }
}
