import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        String joke;
        if (jokes.isEmpty()) {
            joke = "Jokes are in short supply.";
        } else {
            joke = jokes.get(ThreadLocalRandom.current().nextInt(0, jokes.size()));
        }
        return joke;
    }

    public void printJokes() {
        for (String joke:jokes) {
            System.out.println(joke);
        }
    }
}
