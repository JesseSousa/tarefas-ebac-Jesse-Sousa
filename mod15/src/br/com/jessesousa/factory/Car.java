package br.com.jessesousa.factory;

public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine() {
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize its " + horsePower
                + " horse power.");
    }

    void clean() {
        System.out.println("Car has been cleaned, and the " + color + " paint is shining.");
    }

    void mechanicCheck() {
        System.out.println("Car has been checked by the mechanic.");
    }

    void fuelCar() {
        System.out.println("Car is being fueled with " + fuelSource.toLowerCase() + ".");
    }
}
