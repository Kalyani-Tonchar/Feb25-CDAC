/*13. Calculate the Average of Three Numbers
Write a Java program to calculate the average of three numbers.*/

import java.util.Scanner;
class Averageno
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the 1st number:");
double num1=reader.nextDouble();
System.out.print("Enter the 2nd number:");
double num2=reader.nextDouble();
System.out.print("Enter the 3rd number:");
double num3=reader.nextDouble();
double average=(num1+num2+num3)/3;
System.out.println("The Average of three number is:"+average);
}
}



