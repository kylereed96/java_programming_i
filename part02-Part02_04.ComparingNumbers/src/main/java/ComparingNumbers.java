
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        if (first < second) {
            System.out.println(String.format("%d is smaller than %d", first, second));
        } else if (first > second) {
            System.out.println(String.format("%d is greater than %d", first, second));
        } else {
            System.out.println(String.format("%d is equal to %d", first, second));
        }
    }
}
