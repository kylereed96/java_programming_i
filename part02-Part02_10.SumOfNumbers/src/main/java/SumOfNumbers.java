
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                sum += input;
            }
        }

        System.out.println(String.format("Sum of the numbers: %d", sum));

    }
}
