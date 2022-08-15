
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Whil file should have its contents printed?");
        String filepath = scanner.nextLine();

        try (Scanner s = new Scanner(Paths.get(filepath))) {

            while (s.hasNextLine()) {
                String row = s.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
