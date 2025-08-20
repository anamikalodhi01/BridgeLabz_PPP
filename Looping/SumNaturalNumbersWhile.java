import java.util.Scanner;
public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            int sum1 = n * (n + 1) / 2;
            int i = 1, sum2 = 0;
            while(i <= n) sum2 += i++;
            System.out.println("Formula sum: " + sum1 + ", While loop sum: " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
