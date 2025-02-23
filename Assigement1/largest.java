/*11. Find the Largest of Three Numbers 
Write a Java program that takes three numbers as input and finds the largest of the three.*/

class largestno
{
public static void main(String args[])
{
int num1=12,num2=45,num3=45;
int largest=(num1>num2)?((num1>num3)? num1:num3):((num2>num3)? num2:num3);
System.out.println(largest);
}}


