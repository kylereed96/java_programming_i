
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text;
        String longest_name = "";
        int age_sum = 0;
        int num_people = 0;
        while (true) {

            text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            String[] person = text.split(",");

            if (person[0].length() > longest_name.length()) {
                longest_name = person[0];
            }
            age_sum += Integer.valueOf(person[1]);
            num_people++;

        }

        System.out.println("Longest name: " + longest_name);
        System.out.println("Average of the birth years: " + (double) age_sum / num_people);

    }
}
