//Find the Factorial of a number using a while loop.

import java.util.Scanner;

public class Day03D {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int input = sc.nextInt();
        sc.close();
        long factorial = 1;
        int i = 1;
        if (input < 0) {
            System.out.println("Factorial of a negative number doesn't exist.");
        } else {
            while (i <= input) {
                factorial *= i; 
                i++;            
            }
            System.out.println("Factorial of " + input + " is: " + factorial);
        }
    }
}
