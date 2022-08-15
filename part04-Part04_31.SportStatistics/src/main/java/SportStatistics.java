
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner read = new Scanner(Paths.get(file))) {

            ArrayList<Team> teams = new ArrayList<>();
            String input;

            while (read.hasNextLine()) {
                input = read.nextLine();
                if (input.isEmpty()) {
                    continue;
                }

                String[] info = input.split(",");
                Team home = new Team(info[0]);
                Team away = new Team(info[1]);

                if (!teams.contains(home)) {
                    teams.add(home);
                } else {
                    home = teams.get(teams.indexOf(home));
                }

                if (!teams.contains(away)) {
                    teams.add(away);
                } else {
                    away = teams.get(teams.indexOf(away));
                }

                if (Integer.valueOf(info[2]) > Integer.valueOf(info[3])) {
                    home.addGame(true);
                    away.addGame(false);
                } else {
                    home.addGame(false);
                    away.addGame(true);
                }
            }
            System.out.println("Team: ");
            String team = scan.nextLine();
            Team t;
            if (teams.contains(new Team(team))) {
                t = teams.get(teams.indexOf(new Team(team)));
            } else {
                t = new Team(team);
            }
            System.out.println("Games: " + t.getGames());
            System.out.println("Wins: " + t.getWins());
            System.out.println("Losses: " + t.getLosses());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
