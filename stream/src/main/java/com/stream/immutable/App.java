package com.stream.immutable;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Address homeAddress = new Address("Pune","Maharastra");
        List<Course> courseList = new ArrayList<>();
        courseList.add(new Course(1,"Java"));
        courseList.add(new Course(2,"C++"));

        Student avinash = new Student(1, "Avinash",homeAddress,courseList);
        System.out.println(avinash);

        Address address = avinash.getAddress();
        address.setState("BB");
        address.setCity("Solapur");

        System.out.println(avinash);



    }
}
