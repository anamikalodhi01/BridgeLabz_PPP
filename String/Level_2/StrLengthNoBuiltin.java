import java.util.Scanner;

public class StrLengthNoBuiltin {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userLen = findLength(text);
        int builtLen = text.length();

        System.out.println("User-defined length: " + userLen);
        System.out.println("Built-in length: " + builtLen);
        sc.close();
    }
}
