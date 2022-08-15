
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        while (true) {

            text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            for (String word : text.split("\\s+")) {
                System.out.println(word);
            }
        }
    }
}
