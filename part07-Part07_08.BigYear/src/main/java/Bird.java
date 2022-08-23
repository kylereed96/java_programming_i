public class Bird {

    private String name;
    private String latinName;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }


    public boolean equals(Object o) {
        if (o == this) return true;
        if (!o.getClass().equals(this.getClass())) return false;
        Bird b = (Bird) o;
        return this.name.equals(b.getName());
    }

    public String toString() {
        return name + " (" + latinName + ")";
    }

}
