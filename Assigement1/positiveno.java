/*write a program number is positive or not*/

import java.util.Scanner;
class positiveno
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("Enter the number:");
int num=reader.nextInt();
if(num>0)
{
System.out.println("Enter number is positive");
}
else
{
System.out.println("Number is not positive");
}
}
}


