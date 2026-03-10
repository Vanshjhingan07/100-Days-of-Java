
//Calculator for Simple Interest when user enters Principal amount(p), rate of interest(roi), and duration in years(d).

import java.util.Scanner;
public class Day02A{

    public static void main(String args[]){
        System.out.println("Simple interest calculator.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount in inr: ");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest percentage: ");
        double roi = sc.nextDouble();
        System.out.println("Enter duration in years: ");
        double d = sc.nextDouble();

        double si = (p*roi*d)/ 100;
        System.out.println("The simple interest is: " + si );

    }
}

