//BMI calculator in java.

import java.util.Scanner;
public class Day02C{
    public static void main(String args[]){
        System.out.println("BMI Calculator.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in meters:");
        double height = sc.nextDouble();

        System.out.println("Enter your weight in kgs:");
        double weight = sc.nextDouble();

        double bmi = weight/(height*height);
        System.out.println("Your BMI is : " + bmi);

        sc.close();
    }
}