package com.collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ArrayListDemo {



    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"Arun",50000));
        employees.add(new Employee(2,"Mehul",60000));
        employees.add(new Employee(3,"Rinku",40000));
        employees.add(new Employee(4,"Narendra",50000));
        employees.add(new Employee(5,"Harish",80000));
        employees.add(new Employee(6,"Rohit",90000));
        employees.add(new Employee(7,"Rahul",20000));
        employees.add(new Employee(8,"Abhishek",10000));
        employees.add(new Employee(9,"Jaya",50000));
        employees.add(new Employee(10,"Deepak",200000));


        System.out.println("******Iterating employees using for loop********");
        for (int i = 0;i < employees.size();i++){
            System.out.println(employees.get(i));
        }
        System.out.println();

        System.out.println("******Iterating employees using foreach loop********");
        employees.forEach(System.out::println);
        System.out.println();

        System.out.println("******Iterating employees using stream******");
        employees.stream().forEach(System.out::println);
        System.out.println();

        System.out.println("******Iterating employees using iterator******");
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println();

        System.out.println("******Iterating employees using list iterator******");
        Iterator<Employee> listItr = employees.listIterator();
        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }
        System.out.println();

        System.out.println("*******Employees with uppercase name");
        var result = employees.stream().map(employee -> {
            employee.setEmployeeName(employee.getEmployeeName().toUpperCase());
            return employee;
        }).toList();

        result.forEach(System.out::println);
        System.out.println();

        System.out.println("*******Sort Employees");
        employees.stream().sorted((e1,e2) -> e1.getEmployeeName().compareTo(e2.getEmployeeName()))
                .forEach(System.out::println);
        System.out.println();


        System.out.println("AVerage of employees salary");
        double avg  = employees.stream().mapToDouble(Employee::getSalary)
                .average().getAsDouble();

        System.out.println(avg);

    }
}

