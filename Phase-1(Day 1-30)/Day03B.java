//Print the multiplication table for any user-defined number 'N'.


import java.util.Scanner;
public class Day03B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to generate it's multiplication table: ");
        int n = sc.nextInt();
        
        for(int i = 1; i < 11; i++){
            int mult = n*i;
                System.out.println(+ n + " * " + i + " = " + mult);
            }

        }
    }