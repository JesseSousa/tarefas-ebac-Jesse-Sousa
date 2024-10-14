import br.com.jessesousa.cars.*;

public class App {
    public static void main(String[] args) throws Exception {
        CarList<Car> carList = new CarList<>();

        Mercedes mercedes = new Mercedes("200", "Gasoline");
        carList.add(mercedes);

        Tesla tesla = new Tesla("300", "Electricity");
        carList.add(tesla);

        Toyota toyota = new Toyota("150", "Gasoline");
        carList.add(toyota);

        carList.startCars();
        carList.fuelCars();
    }
}
