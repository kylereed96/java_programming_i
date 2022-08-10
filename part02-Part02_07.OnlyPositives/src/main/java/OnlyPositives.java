
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int square;
        while (true) {
            System.out.println("Give a number:");
            input = Integer.valueOf(scanner.nextLine());

            if (input < 0) {
                System.out.println("Unsuitable number");
                continue;
            } else if (input == 0) {
                break;
            }

            square = input * input;
            System.out.println(square);
        }
    }
}
