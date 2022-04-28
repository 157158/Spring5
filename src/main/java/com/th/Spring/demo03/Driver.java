package com.th.Spring.demo03;

public class Driver {
    private String name;

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                '}';
    }
}
