/*11. Find the Largest of Three Numbers 
Write a Java program that takes three numbers as input and finds the largest of the three.

class largestno
{
public static void main(String args[])
{
int num1=12,num2=22,num3=45;
int largest=(num1>num2)?((num1>num3)? num1:num3):((num2>num3)? num2:num3);
System.out.println("The largest Number is:"+largest);
}
}*/

/*user input*/

import java.util.Scanner;
class largestno
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the 1st number:");
int num1=reader.nextInt();

System.out.print("Enter the 2nd number");
int num2=reader.nextInt();

System.out.print("enter the 3rd number:");
int num3=reader.nextInt();
int largest=(num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
System.out.println("The largest number is:"+largest);
}
}





 




