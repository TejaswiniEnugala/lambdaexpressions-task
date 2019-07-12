package com.stckroute.lambdaAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo{

    public List<Employee> printEmployeesWhoseNameStartsWithC(List<Employee> list) {
        List<Employee> li=new ArrayList<>();
        list.forEach(employee -> {
            if(employee.getLastname().startsWith("c"))
                li.add(employee);
        });
        return  li;
    }
        public List<Employee> sortEmployeeBasedOnLastNames(List<Employee>list)
        {
       list.sort(Comparator.comparing(Employee::getLastname));
       return  list;
        }
}



