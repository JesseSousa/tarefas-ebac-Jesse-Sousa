package br.com.jessesousa.cars;

import java.util.*;

public class CarList<T extends Car> {
    private List<T> list;

    public CarList() {
        this.list = new ArrayList<>();
    }

    public void add(T car) {
        list.add(car);
    }

    public void startCars() {
        for (T car : list) {
            car.startEngine();
        }
    }

    public void fuelCars() {
        for (T car : list) {
            car.fuelCar();
        }
    }
}
