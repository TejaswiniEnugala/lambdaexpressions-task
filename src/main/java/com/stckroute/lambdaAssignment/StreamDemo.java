package com.stckroute.lambdaAssignment;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public List<String> printPlacesInSpecificCountry()
    {
        List<String> places=new ArrayList<>();
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");
        List<String> list=new ArrayList<>();
        places.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .forEach((p) -> list.add(p));
        return list;
    }
    }

