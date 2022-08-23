
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first_container = 0;
        int second_container = 0;

        while (true) {
            System.out.printf("First: %d/100%n", first_container);
            System.out.printf("Second: %d/100%n", second_container);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {

                break;
            }

            String[] parts = input.split("\\s");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);

            if (quantity >= 0) {
                if (command.equals("add")) {
                    if (first_container + quantity <= 100) {
                        first_container += quantity;
                    } else {
                        first_container = 100;
                    }

                } else if (command.equals("move")) {
                    if (quantity <= first_container) {
                        first_container -= quantity;
                        if (second_container + quantity < 100) {
                            second_container += quantity;
                        } else {
                            second_container = 100;
                        }
                    } else {
                        if (second_container + first_container < 100) {
                            second_container += first_container;
                        } else {
                            second_container = 100;
                        }
                        first_container = 0;
                    }

                } else if (command.equals("remove")) {
                    if (second_container - quantity > 0) {
                        second_container -= quantity;
                    } else {
                        second_container = 0;
                    }
                }
            }
        }
    }
}
