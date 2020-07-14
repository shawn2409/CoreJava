package com.shawn.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListA {
    public static void main(String[] args) {

        ListA.getPerson();

    }

    public static List<Person> getPerson() {

        List<Person> a = new ArrayList<>();
        a.add(new Person("shawn", "43",new Addess("dallas","tx")));
        a.add(new Person("asif", "22",new Addess("plano","la")));
        a.add(new Person("aks", "34",new Addess("allen","ca")));

        for(Person p:a){
            System.out.println(p.getName()+" "+p.getAge()+p.getAddess().getCity());

        }

       return a;

    }
}
