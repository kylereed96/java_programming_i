import java.util.ArrayList;

public class Suitcase {

    private int weight;
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.weight = 0;
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (weight + item.getWeight() <= maxWeight) {
            items.add(item);
            weight += item.getWeight();
        }
    }

    public String toString() {
        int numItems = items.size();

        if (numItems == 0) {
            return "no items (0 kg)";
        } else if (numItems == 1) {
            return String.format("%s item (%d kg)", numItems, weight);
        } else {
            return String.format("%s items (%d kg)", numItems, weight);
        }
    }

    public void printItems() {
        System.out.println("The suitcase contains the following items:");
        for (Item item:items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        return weight;
    }

    public Item heaviestItem() {
        if (items.isEmpty()) return null;

        Item heaviest = items.get(0);
        for (Item item:items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
