//Reverse a given integer (e.g., 567 becomes 765).

 
import java.util.Scanner;
public class Day03E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to reverse: ");
        
        int num = scanner.nextInt();
        int reversed = 0;
        
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        System.out.println("Reversed Number: " + reversed);
        scanner.close();
    }
}