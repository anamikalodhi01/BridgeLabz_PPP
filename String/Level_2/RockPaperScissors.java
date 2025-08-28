import java.util.*;

public class RockPaperScissors {
    static String[] choices = {"Rock", "Paper", "Scissors"};

    public static String computerChoice() {
        int idx = (int)(Math.random() * 3);
        return choices[idx];
    }

    public static int findWinner(String player, String comp) {
        if (player.equals(comp)) return 0;
        if ((player.equals("Rock") && comp.equals("Scissors")) ||
            (player.equals("Paper") && comp.equals("Rock")) ||
            (player.equals("Scissors") && comp.equals("Paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0, compWins = 0, games = 0;

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String player = sc.next();
            String comp = computerChoice();
            int result = findWinner(player, comp);
            games++;

            if (result == 1) playerWins++;
            else if (result == -1) compWins++;

            System.out.println("Computer: " + comp + " | Result: " +
                (result == 0 ? "Draw" : result == 1 ? "Player Wins" : "Computer Wins"));
        }

        System.out.println("\nFinal Stats:");
        System.out.println("Games: " + games);
        System.out.println("Player Wins: " + playerWins + " (" + (playerWins * 100.0 / games) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + (compWins * 100.0 / games) + "%)");
        sc.close();
    }
}
