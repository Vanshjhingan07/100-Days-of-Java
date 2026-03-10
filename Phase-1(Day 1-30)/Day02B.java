//Write a program to swap two numbers provided by the user without using any temporary or third variable.


import java.util.Scanner;
public class Day02B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping, a = "+ a + " b = " + b );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping,  a = "+ a + " b = " + b );
        sc.close();
        sc.close();
    }
}
