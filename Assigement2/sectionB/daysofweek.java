/*: Days of the Week 
Write a program that uses a nested switch statement to print out the day of the week based on an 
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it 
is a weekday or weekend.*/

import java.util.Scanner;
class daysofweek{
public static void main(String args[])
{
Scanner reader=new Scanner (System.in);
System.out.println("Enter the number:");
int day=reader.nextInt();
switch(day)
{
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
case 7:
System.out.println("Sunday");
break;
default:
System.out.println("Invalid input! Please enter a number between 1 and 7.");
}
switch(day)
{
case 1: case 2: case 3: case 4: case 5:
System.out.println("Its weekday");
break;
case 6: case 7:
System.out.println("Its weekend");
break;
}
}
}