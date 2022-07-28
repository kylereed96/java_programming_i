
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());

        int flatTax, lowerLimit;
        double taxRate;
        if (value < 5000) {
            flatTax = 0;
            taxRate = 0;
            lowerLimit = 0;
        } else if (value < 25000) {
            lowerLimit = 5000;
            flatTax = 100;
            taxRate = .08;
        } else if (value < 55000) {
            lowerLimit = 25000;
            flatTax = 1700;
            taxRate = .1;
        } else if (value < 200000) {
            lowerLimit = 55000;
            flatTax = 4700;
            taxRate = .12;
        } else if (value < 1000000) {
            lowerLimit = 200000;
            flatTax = 22100;
            taxRate = .15;
        } else {
            lowerLimit = 1000000;
            flatTax = 142100;
            taxRate = .17;
        }

        if (taxRate == 0) {
            System.out.println("No tax!");
        } else {
            double tax = (1.0 * flatTax + (value - lowerLimit) * taxRate);
            System.out.println("Tax: " + tax);
        }
    }
}
