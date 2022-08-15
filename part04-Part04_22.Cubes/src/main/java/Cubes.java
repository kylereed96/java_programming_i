
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        int num;

        while (true) {
            input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            } else {
                System.out.println((int) Math.pow(Integer.parseInt(input), 3));
            }
        }
    }
}
