package br.com.jessesousa.factory;

public class Volkswagen extends Car {
    public Volkswagen() {
        super(200, "Gasoline", "Black");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Performing mechanic check for Volkswagen.");
    }
}
