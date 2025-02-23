/*12. Reverse a Number
Write a Java program that takes a number as input and prints the reverse of that number.*/

import java.util.Scanner;

class reverse
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("Enter the Number:");
int num=reader.nextInt();
int reversed=0;
while(num!=0);
int digit=num%10;
reversed = reversed * 10 + digit;
num /= 10; // Remove last digit
System.out.println("Reversed number: " + reversed);
//reader.close(); 
}
}

