package br.com.jessesousa.factory;

public class CompanyCarFactory extends Factory {
    @Override
    public Car retrieveCar(String requestedGrade) {
        if (requestedGrade.equals("A")) {
            return new Tesla();
        } else if (requestedGrade.equals("B")) {
            return new Corola();
        } else {
            return null;
        }
    }
}
