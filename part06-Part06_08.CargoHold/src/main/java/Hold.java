import java.util.ArrayList;

public class Hold {

    private int weight;
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.weight = 0;
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weight + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return String.format("%d suitcases (%d kg)", suitcases.size(), weight);
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase:suitcases) {
            for (Item item:suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }

}
