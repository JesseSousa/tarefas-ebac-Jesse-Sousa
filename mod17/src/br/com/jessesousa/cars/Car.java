package br.com.jessesousa.cars;

public abstract class Car {
    private String horsePower;
    private String fuelSource;

    protected Car(String horsePower, String fuelSource) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
    }

    public void startEngine() {
        System.out.println("The " + fuelSource + " engine has been started, and is ready to utilize " + horsePower
                + " horsepowers.");
    }

    public void fuelCar() {
        System.out.println("Car is being filled with " + fuelSource.toLowerCase());
    }
}
