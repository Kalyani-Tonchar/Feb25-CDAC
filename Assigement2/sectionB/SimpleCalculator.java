/*Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse to check if division by zero is attempted and display an error message.*/

import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean validOperation = true;


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }


    }
}


