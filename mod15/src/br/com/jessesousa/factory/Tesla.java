package br.com.jessesousa.factory;

public class Tesla extends Car {
    public Tesla() {
        super(300, "Electric", "Red");
    }

    @Override
    public void mechanicCheck() {
        System.out.println("Tesla has been checked by the mechanic.");
    }
}
