//Input three distinct numbers. Use only nested if-else statements (no logical operators like AND or OR) to find and print the largest of the three.

import java.util.Scanner;
public class Day02E {
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    int num1 = sc.nextInt();

    System.out.println("Enter second number: ");
    int num2 = sc.nextInt();

    System.out.println("Enter third number: ");
    int num3 = sc.nextInt();

    if(num1>num2){
        if(num1>num3){     
    System.out.println("The greatest number is :" + num1 );
        }
        else{
    System.out.println("The greatest number is :" + num3 );
        }
    }

    else{
    if(num2>num3){
    System.out.println("The greatest number is :" + num2 );
        }
    else{
    System.out.println("The greatest number is :" + num3 );
        }
    }
}
}


