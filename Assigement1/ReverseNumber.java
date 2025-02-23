import java.util.Scanner;

class ReverseNumber {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = reader.nextInt(); // Take user input
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
        reader.close(); // Close the Scanner
    }
}
