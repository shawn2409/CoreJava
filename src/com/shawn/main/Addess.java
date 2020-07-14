package com.shawn.main;

public class Addess {

    private String city;
    private String state;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Addess(String city, String state) {
        this.city = city;
        this.state = state;
    }
}
