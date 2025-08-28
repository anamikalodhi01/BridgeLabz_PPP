import java.util.Scanner;

public class CharFrequencyUnique {

    public static char[] uniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < unique.length(); j++) {
                if (unique.charAt(j) == ch) {
                    found = true;
                    break;
                }
            }
            if (!found) unique.append(ch);
        }
        return unique.toString().toCharArray();
    }

    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[][] freqTable = getCharFrequency(str);

        System.out.println("Character  Frequency");
        for (String[] row : freqTable) {
            System.out.println(row[0] + "          " + row[1]);
        }
    }
}
