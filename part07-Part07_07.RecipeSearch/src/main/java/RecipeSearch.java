
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read:");
        String filePath = scanner.nextLine();


        try (Scanner fileReader = new Scanner(new File(filePath))) {
            String line;
            ArrayList<Recipe> recipes = new ArrayList<>();
            ArrayList<String> recipe = new ArrayList<>();


            while (fileReader.hasNextLine()) {
                line = fileReader.nextLine();
                recipe.add(line);
                if (line.isEmpty() || !fileReader.hasNextLine()) {
                    recipes.add(new Recipe(recipe.get(0),
                            Integer.parseInt(recipe.get(1)),
                            new ArrayList<String>(recipe.subList(2, recipe.size()))));

                    recipe = new ArrayList<>();
                }
            }


            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            String command;
            while (true) {
                command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                } else if (command.equals("list")) {
                    System.out.println("Recipes:");
                    for (Recipe r:recipes) {
                        System.out.println(r);
                    }
                } else if (command.equals("find name")) {
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
                    for (Recipe r :
                            recipes) {
                        if (r.getName().contains(word)) {
                            System.out.println(r);
                        }
                    }
                } else if (command.equals("find cooking time")) {
                    System.out.println("Max cooking time:");
                    int cookingTime = Integer.parseInt(scanner.nextLine());
                    for (Recipe r:recipes) {
                        if (r.getCookingTime() <= cookingTime) {
                            System.out.println(r);
                        }
                    }
                } else if (command.equals("find ingredient")) {
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();

                    for (Recipe r:recipes) {
                        if (r.getIngredients().contains(ingredient)) {
                            System.out.println(r);
                        }
                    }

                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }


    }

}
