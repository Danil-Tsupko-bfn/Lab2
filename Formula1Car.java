package org.example;

public class Formula1Car extends Car {
    private double downforce;

    public Formula1Car() {
        super("", 0, 0);
        this.downforce = 0;
    }

    public Formula1Car(String brand, int year, double horsepower, double downforce) {
        super(brand, year, horsepower);
        this.downforce = downforce;
    }

    public double getDownforce() {
        return downforce;
    }

    @Override
    public void accelerate() {
        System.out.println("Formula 1 car is accelerating with high downforce.");
    }

    public void useDRS() {
        System.out.println("Formula 1 car is using DRS (Drag Reduction System).");
    }

    public String getBrand() {
        return super.getBrand();
    }
}
