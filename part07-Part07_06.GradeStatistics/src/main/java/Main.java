
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into
        // multiple classes.
        Course course = new Course();

        int point;
        while (true) {
            point = Integer.valueOf(scanner.nextLine());

            if (point == -1) {
                break;
            }
            course.addPoint(point);
        }

        course.printStatistics();
    }
}
