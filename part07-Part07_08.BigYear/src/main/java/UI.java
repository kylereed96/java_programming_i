import java.util.Scanner;

public class UI {

    private Scanner s;
    private Observations observations;

    public UI(Scanner s) {
        this.s = s;
        this.observations = new Observations();
    }

    public void start() {
        String command;
        while (true) {
            System.out.println("?");
            command = s.nextLine();

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("Add")) {
                add();
            } else if (command.equals("Observation")) {
                observe();
            } else if (command.equals("All")) {
                printAll();
            } else if (command.equals("One")) {

                printOne();
            } else {
                System.out.println("Invalid input");
            }



        }
    }

    public void add() {
        System.out.println("Name:");
        String name = s.nextLine();
        System.out.println("Name in Latin:");
        String latinName = s.nextLine();
        this.observations.addBird(new Bird(name, latinName));
    }

    public void observe() {
        System.out.println("Bird?");
        String name = s.nextLine();
        this.observations.addObservation(name);
    }

    public void printAll() {
        observations.printAll();
    }

    public void printOne() {
        System.out.println("Bird?");
        String name = s.nextLine();
        observations.printOne(name);
    }
}
