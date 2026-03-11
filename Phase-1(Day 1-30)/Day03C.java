//Write a program to calculate the sum of the first n natural numbers, where n is provided by the user (e.g., if n=5, calculate 1+2+3+4+5).

import java.util.Scanner;
public class Day03C{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find sum of natural numbers till given number.");
        int num = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= num; i++){
            sum += i;
        }
         System.out.println("Sum of first " + num + " natural numbers is : " + sum);

    }
}
