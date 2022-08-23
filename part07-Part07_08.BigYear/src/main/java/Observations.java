import java.util.ArrayList;

public class Observations {

    private ArrayList<Bird> birds;
    private ArrayList<Integer> observations;

    public Observations() {
        this.birds = new ArrayList<>();
        this.observations = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
        observations.add(0);
    }

    public void addObservation(String name) {
        Bird b = new Bird(name, "");
        if (birds.contains(b)) {
            int index = birds.indexOf(b);
            observations.set(index, observations.get(index) + 1);
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void printAll() {
        for (int i = 0; i < birds.size(); i++) {
            System.out.println(birds.get(i) + ": "
                    + observations.get(i) + " observations");
        }
    }

    public void printOne(String name) {
        int index = birds.indexOf(new Bird(name, ""));
        if (index != -1) {
            System.out.println(birds.get(index) + ": "
                    + observations.get(index) + " observations");
        } else {
            System.out.println("Not a bird!");
        }
    }

}
