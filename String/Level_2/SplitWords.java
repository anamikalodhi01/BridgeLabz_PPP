import java.util.*;

public class SplitWords {

    public static String[] customSplit(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (current.length() > 0) {
                    words.add(current.toString());
                    current.setLength(0);
                }
            } else {
                current.append(c);
            }
        }
        if (current.length() > 0) {
            words.add(current.toString());
        }

        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");

        System.out.println("Custom split: " + Arrays.toString(custom));
        System.out.println("Built-in split: " + Arrays.toString(builtin));
        System.out.println("Are both same? " + compareArrays(custom, builtin));
        sc.close();
    }
}
