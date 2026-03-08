//Calculating area and circumference of circle in java.

import java.util.Scanner;
public class Day01D {
    public static void main(String args[]){
        System.out.println("Program to calculate area and circumference of circle");
        System.out.println("Enter radius of circle:");

        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        double Area = 3.14 * radius* radius;
        double Circumference = 2 * 3.14 * radius;

        System.out.println("Area of circle is: " + Area);
        System.out.println("Circumference of circle is: " + Circumference);
}
    
}
