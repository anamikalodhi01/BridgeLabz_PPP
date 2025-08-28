import java.util.*;

public class StrStringIndex {
    public static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // invalid index
    }
    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //generateException(s);
        handleException(s);
    }
}
