
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file: ");
        String file = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(file))) {

            String line;
            while (reader.hasNextLine()) {
                line = reader.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] parts = line.split(",");

                if (Integer.valueOf(parts[1]) == 1) {
                    System.out.printf("%s, age: %s year%n", parts[0], parts[1]);

                } else {
                    System.out.printf("%s, age: %s years%n", parts[0], parts[1]);
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
