//Write a program to print the multiplication table of a number N, entered by the

// use

import java.util.*;

public class multitable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which you want table");
        int table = sc.nextInt();
        System.out.println("Upto which value you want table : ");
        int value = sc.nextInt();
        for (int i = 1; i <= value; i++) {
            System.out.println(table + " x " + i + " = " + table * i);
        }
        sc.close();
    }
}
