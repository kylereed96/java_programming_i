
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Item> archive = new ArrayList<>();
        String identifier, name;
        Item item;

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            item = new Item(identifier, name);
            if (!archive.contains(item)) {
                archive.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item i :
                archive) {
            System.out.println(i);
        }


    }
}
