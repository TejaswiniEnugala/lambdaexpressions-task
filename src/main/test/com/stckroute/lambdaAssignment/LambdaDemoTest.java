package com.stckroute.lambdaAssignment;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class LambdaDemoTest {
    LambdaDemo sort;
    @Before
    public void setUp(){
        sort=new LambdaDemo();
    }
    @Test
    public void sortTheEmployeesBasedOnTheirLastName(){
        List<Employee> arrayList=new ArrayList<Employee>();
        arrayList.add(new Employee("enugala","Teju",21));
        arrayList.add(new Employee("ketiri","suma",21));
        arrayList.add(new Employee("kamodula","Bindu",22));
        arrayList.add(new Employee("samala","spoorthi",22));
        arrayList.add(new Employee("naredla","siri",21));
        List<Employee> result=sort.sortEmployeeBasedOnLastNames(arrayList);
        List<Employee> expected=new ArrayList<Employee>();
        expected.add(new Employee("enugala","Teju",21));
        expected.add(new Employee("kamodula","Bindu",22));
        expected.add(new Employee("ketiri","suma",21));
        expected.add(new Employee("naredla","siri",21));
        expected.add(new Employee("samala","spoorthi",22));
        assertEquals(expected.toString(), result.toString());
    }

}