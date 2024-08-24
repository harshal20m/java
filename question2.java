
//Write a program that reads a set of integers, and then prints the sum of the

// even and odd integers.

import java.util.*;;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter The Number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {

                oddSum += number;
            }
            System.out.println("Do you want to continue enter 1 ");
            choice = sc.nextInt();
        } while (choice == 1);
        sc.close();
        System.out.println("The sum of evenInteger entered is " + evenSum);
        System.out.println("The sum of oddInteger entered is " + oddSum);
    }
}
