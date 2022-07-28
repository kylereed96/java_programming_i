
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String s = scan.nextLine();
        System.out.println("Give an integer:");
        int i = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double d = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean b = Boolean.valueOf(scan.nextLine());
        System.out.println(String.format("You gave the string %s", s));
        System.out.println(String.format("You gave the integer %d", i));
        System.out.println(String.format("You gave the double %.1f", d));
        System.out.println(String.format("You gave the boolean %b", b));

    }
}
