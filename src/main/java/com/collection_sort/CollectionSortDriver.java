package com.collection_sort;

import com.collection_sort.helpers.CollectionSortByAge;
import com.collection_sort.helpers.CollectionSortByID;
import com.collection_sort.helpers.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortDriver {
    public static void main(String[] args) {
        ArrayList<Employee> emps = new ArrayList<Employee>();
        emps.add(new Employee(3,24,"Vinni"));
        emps.add(new Employee(1,23,"Abhi"));
        emps.add(new Employee(4,25,"UK"));
        emps.add(new Employee(2,3,"KK"));

        System.out.println("Available Employee List");
        System.out.println("------------------------------------");
        for(Employee i : emps){
            System.out.println(i);
        }

        System.out.println("\n------------------------------------");
        System.out.println("Employee List sorted by ID");
        System.out.println("------------------------------------");
        //sort the collection by ID
        Collections.sort(emps, new CollectionSortByID());
        for(Employee i : emps){
            System.out.println(i);
        }


        System.out.println("\n------------------------------------");
        System.out.println("Employee List sorted by Age");
        System.out.println("------------------------------------");
        //sort the collection by Age
        Collections.sort(emps, new CollectionSortByAge());
        for(Employee i : emps){
            System.out.println(i);
        }
    }
}
