package com.stckroute.lambdaAssignment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StreamDemoTest {
    StreamDemo listOfPlaces;
    @Before
    public void setup()
    {
        listOfPlaces=new StreamDemo();
    }
    @Test
    public void checkThePlacesFromNepal()
    {
        List<String> result=listOfPlaces.printPlacesInSpecificCountry();
        List<String> expected=new ArrayList<>();
        expected.add("Nepal, Kathmandu");
        expected.add("Nepal, Pokhara");
        assertEquals(expected.toString(),result.toString());

    }
    @After
    public void tearDown(){
        listOfPlaces=null;
    }

}