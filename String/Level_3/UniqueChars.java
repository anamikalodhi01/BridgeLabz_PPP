import java.util.*;

public class UniqueChars {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    // Method to find unique characters
    public static char[] findUnique(String str) {
        int len = findLength(str);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (c == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = c;
        }

        return Arrays.copyOf(temp, index);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char[] unique = findUnique(str);
        System.out.println("Unique characters: " + Arrays.toString(unique));
    }
}
