import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = Float.parseFloat(scanner.next());
        }

        scanner.close();
        float media = CalculoMedia.calcularMedia(notas);

        System.out.println("A média do aluno foi: " + media);
        System.out.print("status: ");
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("De recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
