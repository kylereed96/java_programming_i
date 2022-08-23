
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.printf("First: %s%n", container1);
            System.out.printf("Second: %s%n", container2);
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split("\\s");
            String command = parts[0];
            int quantity = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(quantity);

            } else if (command.equals("move")) {
                if (container1.contains() < quantity) {
                    container2.add(container1.contains());
                } else {
                    container2.add(quantity);
                }
                container1.remove(quantity);

            } else if (command.equals("remove")) {
                container2.remove(quantity);
            }

        }
    }

}
