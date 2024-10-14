package br.com.jessesousa.factory;

public class CarFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if (requestedGrade.equals("A")) {
            return new Toyota();
        } else if (requestedGrade.equals("B")) {
            return new Volkswagen();
        } else {
            return null;
        }
    }
}
