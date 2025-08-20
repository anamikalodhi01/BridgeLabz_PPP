import java.util.Scanner;
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n > 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0;
            for(int i = 1; i <= n; i++) sum2 += i;
            System.out.println("Formula sum: " + sum1 + ", For loop sum: " + sum2);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
