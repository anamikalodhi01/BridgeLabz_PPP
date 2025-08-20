import java.util.Scanner;
public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        if(num > 0 && pow >= 0) {
            int result = 1, counter = 0;
            while(counter < pow) {
                result *= num;
                counter++;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
