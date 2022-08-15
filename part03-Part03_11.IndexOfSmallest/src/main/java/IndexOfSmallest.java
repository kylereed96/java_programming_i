
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        // ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> indices = new ArrayList<>();

        int smallest = Integer.MAX_VALUE;
        int index = 0;
        while (true) {

            int number = Integer.valueOf(scanner.nextLine());
            if (number == 9999) {
                break;
            }

            if (number < smallest) {
                smallest = number;
                indices = new ArrayList<>();
                indices.add(index);

            } else if (number == smallest) {
                indices.add(index);
            }

            // numbers.add(number);
            index += 1;

        }

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < indices.size(); i++) {
            System.out.println("Found at index: " + indices.get(i));
        }
        
    }
}
