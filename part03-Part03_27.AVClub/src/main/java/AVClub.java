
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        while (true) {

            text = scanner.nextLine();
            if (text.equals(""))  {
                break;
            }

            for (String word:text.split(" ")) {

                if (word.contains("av")) {
                    System.out.println(word);
                }
            }
        }
    }
}
