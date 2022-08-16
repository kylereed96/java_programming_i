
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        }

        Song testSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (!jackSparrow.equals(testSparrow)) {
            System.out.println("Songs are not equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }
    }
}
