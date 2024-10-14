package br.com.jessesousa.factory;

public abstract class Factory {
    public Car create(String requestedGrade) {
        Car car = retrieveCar(requestedGrade);
        prepareCar(car);
        return car;
    }

    private void prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
    }

    abstract Car retrieveCar(String requestedGrade);
}