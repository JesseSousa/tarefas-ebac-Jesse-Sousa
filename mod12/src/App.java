import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes com o gênero separados por vírgula (Ex.: Joao-M,Maria-F): ");
        String input = scanner.nextLine();
        scanner.close();

        String[] namesWithGender = input.split(",");
        Map<String, List<String>> namesMap = separateByGender(namesWithGender);
        printNamesByGender(namesMap);
    }

    private static Map<String, List<String>> separateByGender(String[] namesWithGender) {
        Map<String, List<String>> namesMap = new HashMap<>();
        List<String> maleNames = new ArrayList<>();
        List<String> femaleNames = new ArrayList<>();

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

        namesMap.put("male", maleNames);
        namesMap.put("female", femaleNames);

        return namesMap;
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

    private static void printNamesByGender(Map<String, List<String>> namesMap) {
        System.out.println("Nomes masculinos: ");
        printNames(namesMap.get("male"));
        System.out.println("Nomes femininos: ");
        printNames(namesMap.get("female"));
    }
}
