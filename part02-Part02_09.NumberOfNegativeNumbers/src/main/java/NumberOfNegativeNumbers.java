
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNegativeNums = 0;
        int input;

        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input < 0) {
                numNegativeNums += 1;
            }
        }
        System.out.println(String.format("Number of negative numbers: %d", numNegativeNums));
    }
}
