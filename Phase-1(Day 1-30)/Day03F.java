//Check if a number is a Palindrome (Original == Reversed)



import java.util.Scanner;
public class Day03F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // Validate input to ensure it is an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.close();
            return;
        }

        int num = scanner.nextInt();
        scanner.close();
     
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10; 
            reversedNum = reversedNum * 10 + digit;
                        num /= 10;\
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome number.");
        }
    }
}
