package com.th.Spring.demo03;

public class Cat {
    //颜色
    private String colour;
    //型号
    private String model;
    //驾驶人
    private Driver driver = null;

    public Cat() {}

    @Override
    public String toString() {
        return "Cat{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", driver=" + driver +
                '}';
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
