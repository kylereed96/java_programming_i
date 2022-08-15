
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        while (true) {

            text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] pieces = text.split(" ");
            System.out.println(pieces[pieces.length - 1]);
        }
    }
}
