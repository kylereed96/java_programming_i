
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number?");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = 0;
        for (int i = first; i < last + 1; i++) {
            sum += i;
        }

        System.out.printf("The sum is: %d%n", sum);
    }
}
