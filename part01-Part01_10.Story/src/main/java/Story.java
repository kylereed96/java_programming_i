
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String mainCharacter = scanner.nextLine();
        System.out.println("What is their job?");
        String mainCharacterJob = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println(String.format("Once upon a time there was %s, who was %s.", mainCharacter, mainCharacterJob));
        System.out.println(String.format("On the way to work, %s reflected on life.", mainCharacter));
        System.out.println(String.format("Perhaps %s will not be %s forever.", mainCharacter, mainCharacterJob));
    }
}
