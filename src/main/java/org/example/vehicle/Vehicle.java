package org.example.vehicle;

public class Vehicle {
   public int numWheels;

    Vehicle(int numWheels) {
    this.numWheels = numWheels;
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public int getNumWheels() {
        return numWheels;
    }
}
