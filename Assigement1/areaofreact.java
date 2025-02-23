/*Write a program for area of reactangle*/

import java.util.Scanner;
class areaofreact
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the length of reactangle:");
int length=reader.nextInt();
System.out.print("Enter the width of reactangle:");
int width=reader.nextInt();
int area=length*width;
System.out.println("The area of reactangle is:"+area);
}
}
