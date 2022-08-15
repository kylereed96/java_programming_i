
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        while (true) {

            text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            System.out.println(text.split(" ")[0]);
        }
    }
}
