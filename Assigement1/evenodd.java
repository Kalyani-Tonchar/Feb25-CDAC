/*10. Check If a Number Is Even or Odd Write a Java program that checks if a number is even or odd.*/

import java.util.Scanner;
class evenodd{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the number:");
int num=reader.nextInt();
if(num%2==0){
System.out.println("Number is Even");
}
else
{
System.out.println("Number is odd");
}
}
}

