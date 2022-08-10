
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        int numOfNums = 0;
        int input;

        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else {
                sum += input;
                numOfNums += 1;
            }
        }

        System.out.printf("Number of numbers: %d%n", numOfNums);
        System.out.printf("Sum of the numbers: %d%n", sum);


    }
}
