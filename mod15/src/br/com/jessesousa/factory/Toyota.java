package br.com.jessesousa.factory;

public class Toyota extends Car {
    public Toyota() {
        super(300, "Electric", "Red");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Performing mechanic check for Toyota.");
    }
}
