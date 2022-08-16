
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o != null && o.getClass() != this.getClass()) return false;
        Person p = (Person) o;
        return name.equals(p.name) && birthday.equals(p.birthday) && height == p.height && weight == p.weight;
    }
}
