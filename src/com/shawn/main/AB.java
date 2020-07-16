package com.shawn.main;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AB {

    public static void main(String[] args) {

        Integer[] a = {1, 1, 2, 2, 2, 2, 3,};

        Map<Integer, Integer> integerMap = new HashMap<>();


        for (int i = 0; i < a.length; i++) {

            if (integerMap.containsKey(a[i])) {
                integerMap.put(a[i], a[i] + 1);
            } else {
                integerMap.put(a[i], 1);
            }

        }
        for (Map.Entry m : integerMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }




        String[] b = {"er", "sd", "ss", "fs", "lp"};


    }
}



