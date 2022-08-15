
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int max_age = Integer.MIN_VALUE;
        int age;
        while (true) {

            text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] person = text.split(",");
            age = Integer.valueOf(person[1]);
            if (age > max_age) {
                max_age = age;
            }
        }

        System.out.println("Age of the oldest: " + max_age);

    }
}
