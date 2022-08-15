
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        int max_age = Integer.MIN_VALUE;
        String name = "";
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
                name = person[0];
            }
        }

        System.out.println("Name of the oldest: " + name);


    }
}
