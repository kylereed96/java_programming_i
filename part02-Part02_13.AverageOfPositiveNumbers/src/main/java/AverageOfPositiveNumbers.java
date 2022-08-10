
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            } else if (input > 0){
                sum += input;
                numOfNums += 1;
            }
        }

        if (numOfNums == 0) {
            System.out.println("Cannot calculate the average");
        } else {

            double ave = (double) sum / numOfNums;
            System.out.printf(String.valueOf(ave));
        }

    }
}
