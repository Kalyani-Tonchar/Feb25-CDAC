/*1. Write a program to calculate the sum of the first 50 natural numbers.*/

import java.util.Scanner;
public class SumUsingFormula { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter a number: "); 
int num = sc.nextInt();
sc.close();
int sum = (num * (num + 1)) / 2;
System.out.println("Sum of the first " + num + " natural numbers: " + sum);
} 
}
