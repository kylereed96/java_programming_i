import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (this.equals(o)) return true;
        if (o.getClass() != this.getClass()) return false;
        Recipe r = (Recipe) o;
        return r.name.equals(this.name);
    }
}
