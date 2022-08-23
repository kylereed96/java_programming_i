public class Container {

    private int quantity;
    private static final int MAX_QUANTITY = 100;

    public Container() {
        this.quantity = 0;
    }

    public int contains() {
        return this.quantity;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.quantity = Math.min(100, this.quantity + amount);
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            this.quantity = Math.max(0, this.quantity - amount);
        }
    }

    public String toString() {
        return this.quantity + "/100";
    }
}
