/*19. Calculate the Power of a Number
Write a Java program that calculates the power of a number. Take two numbers as input: the 
base and the exponent, and compute the result of base raised to the power of exponent.
Test Data:
 Input base number: 3
 Input exponent number: 4
Expected Output:
3 raised to the power 4 is 81
*/

import java.util.Scanner;

class PowerCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs
        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent number: ");
        int exponent = sc.nextInt();

        // Calculating power using a loop
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Displaying the result
        System.out.println(base + " raised to the power " + exponent + " is " + result);

        sc.close(); // Close scanner to prevent resource leaks
    }
}
