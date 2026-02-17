import java.util.*;

public class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the value of n ");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 0; i <= n; i++) {
            fact *= i;
        }
        System.err.println("the factorial of " + n + " is = " + fact);

    }
}