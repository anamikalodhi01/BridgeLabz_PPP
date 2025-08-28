import java.util.Scanner;

public class StrVowelConsonantType {

    public static String charType(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
            char lower = Character.toLowerCase(c);
            if ("aeiou".indexOf(lower) != -1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c + "\t" + charType(c));
        }
        sc.close();
    }
}
