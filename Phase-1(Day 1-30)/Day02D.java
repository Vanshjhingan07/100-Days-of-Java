//Write a program that asks for a user's age. If the age is 18 or older, print "Eligible to Vote." Otherwise, calculate and display how many years they must wait until they are eligible.

import java.util.Scanner;
public class Day02D {
    public static void main(String args[]){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        double age = sc.nextDouble();
        double agelimit = 18-age;

        if(age>=18){
        System.out.println("You are eligible to vote!");
    }
        else{
            System.out.println("You must wait for " + agelimit + " years to be eligible to vote.");
        }
    }
}

