import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite sua idade: ");
        Scanner scanner = new Scanner(System.in);
        int userAgePrimitive = scanner.nextInt();
        Integer userAge = userAgePrimitive;
        scanner.close();
        System.out.println("Sua idade é: " + userAge);
    }
}
