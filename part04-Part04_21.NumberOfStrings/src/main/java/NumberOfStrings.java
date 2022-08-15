
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int num = 0;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            } else {
                num += 1;
            }
        }
        System.out.println(num);
    }
}
