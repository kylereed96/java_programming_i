
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfNumbers = 0;
        int input;

        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                numberOfNumbers += 1;
            }
        }
        System.out.println(String.format("Number of numbers: %d", numberOfNumbers));
    }
}
