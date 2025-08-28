import java.util.Scanner;

public class TrimSpaces {

    public static String trimCustom(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) sb.append(str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String custom = trimCustom(text);
        String builtin = text.trim();

        System.out.println("Custom trimmed: [" + custom + "]");
        System.out.println("Built-in trimmed: [" + builtin + "]");
        System.out.println("Equal? " + custom.equals(builtin));
        sc.close();
    }
}
