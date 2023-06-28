package org.example.vehicle;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        super(4);
        this.make = make;
        this.model = model;
        this.year = year;
    }


    public void move() {
        System.out.println("The car is driving.");
    }

    public void honk() {
     System.out.println("Honk, honk");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "This is a vehicle with" + numWheels + " wheels.";
    }

}
