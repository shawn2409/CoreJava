package com.shawn.main;

public class Person {

    private String name;
    private String age;
    private Addess addess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Addess getAddess() {
        return addess;
    }

    public void setAddess(Addess addess) {
        this.addess = addess;
    }

    public Person(String name, String age, Addess addess) {
        this.name = name;
        this.age = age;
        this.addess = addess;
    }
}
