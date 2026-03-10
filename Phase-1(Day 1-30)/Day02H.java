// Write a program to calculate the tax amount based on an annual income (L = Lakhs):
// | Income Range | Tax Rate |
// | :---         | :---     |
// | Below 2.5L   | 0%       |
// | 2.5L to 5.0L | 5%       |
// | 5.0L to 10.0L| 20%      |
// | Above 10.0L  | 30%      |

import java.util.Scanner;
public class Day02H {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current salary per annum:");
        double salary = sc.nextDouble();
        double tax = 0;

        if(salary<250000){
            tax = 0;
        }
        else if(salary >=250000 && salary<=500000){
            tax = salary*0.05;
        }
        else if(salary >=500000 && salary<=1000000){
            tax = salary*0.20;
        }
        else {
            tax = salary*0.30;
        }
        System.out.println("tax amount: " + tax);
        System.out.println("your salary after tax: " + (salary-tax));

        sc.close();
    }
}
