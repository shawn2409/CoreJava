package com.shawn.main;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AB {

    public static void main(String[] args) {

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1, "shawn");
        integerStringMap.put(2, "ron");
        integerStringMap.put(3, "bob");


        Iterator<Map.Entry<Integer, String>> itr = integerStringMap.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }
}



