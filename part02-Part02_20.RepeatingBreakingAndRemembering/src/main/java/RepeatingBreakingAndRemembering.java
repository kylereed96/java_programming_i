
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int input = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        int numOfNums = 0;
        int even = 0;
        while (true) {
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += input;
            numOfNums += 1;

            if (input % 2 == 0) {
                even += 1;
            }

            input = Integer.valueOf(scanner.nextLine());
        }

        double average = (double) sum / numOfNums;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Numbers: %d%n", numOfNums);
        System.out.printf("Average: %s%n", average);
        System.out.printf("Even: %d%n", even);
        System.out.printf("Odd: %d%n", numOfNums - even);
    }
}
