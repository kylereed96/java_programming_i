
import java.util.HashMap;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        HashMap<String, String> logins = new HashMap<>();
        logins.put("alex", "sunshine");
        logins.put("emma", "haskell");

        if (logins.containsKey(username) &&
                logins.get(username).equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
