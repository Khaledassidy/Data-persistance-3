package com.example.datapersistance3.NativeDatabaseImpliment;

public class Car {

    private int id;
    private String mode;
    private String color;
    private double dpl;

    public Car(int id, String mode, String color, double dpl) {
        this.id = id;
        this.mode = mode;
        this.color = color;
        this.dpl = dpl;
    }
    public Car(String mode, String color, double dpl) {
        this.mode = mode;
        this.color = color;
        this.dpl = dpl;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDpl() {
        return dpl;
    }

    public void setDpl(double dpl) {
        this.dpl = dpl;
    }
}
