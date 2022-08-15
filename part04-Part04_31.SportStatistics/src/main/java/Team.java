import java.util.Objects;

public class Team {

    private String name;
    private int games;
    private int wins;
    private int losses;

    public Team(String name) {
        this.name = name;
        this.games = 0;
        this.wins = 0;
        this.losses = 0;
    }

    public void addGame(boolean win) {
        this.games += 1;

        if (win) {
            this.wins += 1;
        } else {
            this.losses += 1;
        }
    }

    public int getGames() {
        return games;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return name.equals(team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
