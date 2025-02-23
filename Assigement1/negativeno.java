/*write a program number is negative or not*/

import java.util.Scanner;
 class negativeno{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the number");
int num=reader.nextInt();
if(num<0)
{
System.out.println("Number is negative");
}
else
{
System.out.println("number is not negative");
}
}
}