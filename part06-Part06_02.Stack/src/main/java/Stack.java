import java.util.ArrayList;

public class Stack {

    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return (this.values.size() == 0);
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return values;
    }

    public String take() {
        return values.remove(values.size() - 1);
    }



}
