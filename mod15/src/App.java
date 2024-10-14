import br.com.jessesousa.factory.*;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("A", false);
        Factory factory = getFactory(customer);
        Car car = factory.create(customer.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new CompanyCarFactory();
        }

        return new CarFactory();
    }
}
