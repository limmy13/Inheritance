package org.example;

import org.example.vehicle.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle v = new Car("Subaru", "Outback", 2015);
        v.move(); // what will be printed out?
        // Car car = v; doesn't work
        Car car = (Car)v;
        car.honk();
        ((Car)v).honk(); // v is now type car temporarily so honk method will work on it
        }

}