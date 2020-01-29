package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = CarFactory.getCar(Car.BMW);
        car.start();
    }
}
