//Determine if a given year is a Leap Year. You must follow the precise calendar logic.

import java.util.Scanner;
    public class Day02F{
        public static void main(String args[]){
            System.out.println("Enter a year to check if it is a leap year");
            Scanner sc = new Scanner(System.in);
            int year = sc.nextInt();

            if(year%4==0){
                if(year%100==0){
                    if(year%400==0){
                System.out.println("The given year is a leap year");
                    }
                    else{
                        System.out.println("The given year is not a leap year.");
                    }
                }
            else{
                System.out.println("The given year is a leap year.");
            }
        }
    else{
                System.out.println("The given year is not a leap year.");
            }
}
    }