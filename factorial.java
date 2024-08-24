
//Write a program to find the factorial of any number entered by the user.

// n = n * (n-1) * (n-2) * (n-3)*1

import java.util.*;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial " + factorial);
        sc.close();
    }
}
