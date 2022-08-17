
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String str;
        int size = elements.size();
        if (size == 0) {
            str = String.format("The collection %s is empty.", name);
        } else if (size == 1) {
            str = String.format("The collection %s has 1 element:\n", name);
            str += elements.get(0);
        } else {
            str = String.format("The collection %s has %d elements:\n", name, size);
            for (String element:elements) {
                str += element + "\n";
            }
        }
        return str;
    }
}
