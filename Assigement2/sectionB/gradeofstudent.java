/*Grade Classification 
Write a program to classify student grades based on the following criteria:*/
import java.util.Scanner;
class gradeofstudent
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.print("Enter the NUmber:");
int num=reader.nextInt();
//int num=100;
if(num>=90)
{
System.out.println("A");
}
else if(num>=80)
{
System.out.println("B");
}
else if(num>=70)
{
System.out.println("c");
}
else if(num>=60)
{
System.out.println("D");
}
else
{
System.out.println("f");
}
}
}




