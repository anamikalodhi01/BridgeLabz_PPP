import java.util.*;

public class StrToUpper {
    public static String customToUpper(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') res += (char)(c - 32);
            else res += c;
        }
        return res;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String s1 = customToUpper(text);
        String s2 = text.toUpperCase();
        System.out.println("Compare: " + compareStrings(s1, s2));
    }
}
