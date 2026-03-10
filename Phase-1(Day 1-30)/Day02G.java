//Input three angles from the user. Determine if these angles can form a valid triangle.

import java.util.Scanner;
public class Day02G {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter three angles for checking if those angles form a valid triangle or not.");

    System.out.println("Enter first angle: ");
    int angle1 = sc.nextInt();

    System.out.println("Enter second angle: ");
    int angle2 = sc.nextInt();

    System.out.println("Enter third angle: ");
    int angle3 = sc.nextInt();

    int triangle = angle1+angle2+angle3;

    if(triangle==180 && angle1>0 && angle2>0 && angle3>0){
        System.out.println("The given angles form a valid triangle.");
    }
        else{
            System.out.println("The given angles do not form a valid triangle.");
        }
    }
}
