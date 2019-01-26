package com.collection_sort.helpers;

import java.util.Comparator;

public class CollectionSortByAge implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
