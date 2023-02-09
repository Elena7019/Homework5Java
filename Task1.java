package DomashkiJava.Hw5Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Map<String, List<String>> phonBook = new HashMap<>();
        phonBook.put("Sergeev", List.of("1234567890", "2345678901"));
        phonBook.put("Ivanets", List.of("9876543210", "8765432109"));
        phonBook.put("Gordeev", List.of("6743209855", "6847284577"));
        phonBook.put("Simonovski", List.of("1213141516", "6758493021"));
        phonBook.put("Garazh", List.of("1029384756", "6758493057"));

        menu(phonBook);
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> phonBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phonBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phonBook) {
        System.out.println(phonBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phonBook) {
        System.out.println("Если хотите выйте хотите перестать вводить номера введите 'stop'");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("stop")) {
                break;
            } else {
                number.add(phon);
            }
        }
        phonBook.put(name, number);

        return phonBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) {
        System.out.println(
                "Введите команду: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "find":
                        find(phonBook);
                        break;
                    case "add":
                        add(phonBook);
                        break;
                    case "all":
                        allBook(phonBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phonBook;
    }
}
