import java.util.Scanner;

public class CharFrequency {
    public static String[][] getCharFrequency(String text) {
        int[] freq = new int[256];  // ASCII characters
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; // to avoid duplicates
                index++;
            }
        }
        return java.util.Arrays.copyOf(result, index);
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
