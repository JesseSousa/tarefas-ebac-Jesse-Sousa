package br.com.jessesousa.factory;

public class Corola extends Car {
    public Corola() {
        super(200, "Diesel", "Silver");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Corola has been checked by the mechanic.");
    }
}
