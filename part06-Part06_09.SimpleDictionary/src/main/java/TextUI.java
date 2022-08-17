import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        String command, translation, word;
        while (true) {
            System.out.println("Command: ");
            command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word: ");
                word = scanner.nextLine();
                System.out.println("Translation: ");
                translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated: ");
                word = scanner.nextLine();
                translation = dictionary.translate(word);
                if (translation == null) {
                    System.out.printf("Word %s was not found%n", word);
                } else {
                    System.out.printf("Translation: %s%n", translation);
                }
            }
            System.out.println("Unknown command");
        }
    }
}
