import java.util.*;

public class StrArrayIndex {
    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]); // invalid
    }
    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) arr[i] = sc.next();
        //generateException(arr);
        handleException(arr);
    }
}
