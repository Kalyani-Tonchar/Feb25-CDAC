/*17. Print the First N Natural Numbers
Write a Java program to print the first N natural numbers, where N is provided by the user.
Test Data:
 Input a number: 6
Expected Output:
1 2 3 4 5 6
*/

import java.util.Scanner;
class naturalno
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter the number:");
int num=sc.nextInt();
System.out.print("The first "+ num+ " natural number are:");
for(int i=1;i<=num;i++)
System.out.print(i+" ");
}
}


