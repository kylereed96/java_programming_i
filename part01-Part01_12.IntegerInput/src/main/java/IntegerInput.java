
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        String input = scanner.nextLine();
        int value = Integer.valueOf(input);
        System.out.println(String.format("You gave the number %d", value));
    }
}
