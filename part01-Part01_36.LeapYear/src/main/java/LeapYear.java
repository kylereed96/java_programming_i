
import sun.font.TrueTypeFont;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());

        boolean leapYear;
        if (year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        } else if (year % 100 == 0) {
            leapYear = false;
        } else if (year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (leapYear) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
