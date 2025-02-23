/*20. Count the Number of Digits in a Number
Write a Java program that counts the number of digits in a given number.
Test Data:
 Input number: 123456
Expected Output:
The number 123456 has 6 digits*/

import java.util.Scanner;
class digitcount{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number:");
int num=sc.nextInt();
int count=0;
int temp=num;
while(num!=0){
num=num/10;
count++;
}
System.out.println("The count of "+ temp + " is :"+ count);
}
}



