import java.util.*;

public class VotingEligibility {

    public static int[] randomAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) ages[i] = r.nextInt(90); // 0–89
        return ages;
    }

    public static String[][] canVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) result[i][1] = "true";
            else result[i][1] = "false";
        }
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = randomAges(10);
        String[][] table = canVote(ages);
        display(table);
    }
}
