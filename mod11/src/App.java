import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes separados por vírgula: ");
        String input = scanner.nextLine();

        String[] names = input.split(",");
        List<String> nameList = new ArrayList<>(Arrays.asList(names));
        Collections.sort(nameList);

        System.out.println("\nNomes ordenados: ");
        printNames(nameList);

        System.out.println("Agora digite nomes com o gênero separados por vírgula (Ex.: Joao-M,Maria-F): ");
        input = scanner.nextLine();
        scanner.close();

        String[] namesWithGender = input.split(",");
        Map<String, List<String>> namesMap = separateByGender(namesWithGender);
        printNamesByGender(namesMap);
    }

    private static Map<String, List<String>> separateByGender(String[] namesWithGender) {
        List<String> maleNames = new ArrayList<String>();
        List<String> femaleNames = new ArrayList<String>();

        for (String nameWithGender : namesWithGender) {
            String[] nameAndGender = nameWithGender.split("-");
            String name = nameAndGender[0];
            String gender = nameAndGender[1];

            if (gender.equals("M")) {
                maleNames.add(name);
            } else {
                femaleNames.add(name);
            }
        }

        Map<String, List<String>> namesMap = new HashMap<>();
        namesMap.put("male", maleNames);
        namesMap.put("female", femaleNames);
        return namesMap;
    }

    private static void printNamesByGender(Map<String, List<String>> namesMap) {
        System.out.println("\nNomes masculinos: ");
        printNames(namesMap.get("male"));
        System.out.println("\nNomes femininos: ");
        printNames(namesMap.get("female"));
    }

    private static void printNames(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            if (i == names.size() - 1) {
                System.out.println(names.get(i).trim() + "\n");
                break;
            }

            System.out.print(names.get(i).trim() + ", ");
        }
    }
}