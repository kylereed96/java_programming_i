
import java.util.Scanner;

public class AverageOfNumbers {

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

        double ave = (double) sum / numOfNums;
        System.out.printf("Average of the numbers: %f%n", ave);


    }
}

