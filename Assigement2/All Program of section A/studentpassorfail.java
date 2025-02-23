/*Write a program that determines whether a student passes or fails based on their grades in three 
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or 
more subjects, print the number of subjects they failed in.*/

import java.util.Scanner;
class studentpassorfail
{
public static void main(String args[])
{
Scanner reader=new Scanner(System.in);
System.out.println("Enter the Marks of english:");
int english=reader.nextInt();
System.out.println("Enter the Marks of marathi:");
int marathi=reader.nextInt();
System.out.println("Enter the Marks of Hindi:");
int hindi=reader.nextInt();


if(english>=40 && marathi>=40 && hindi>=40)
{
System.out.println("The Student passed in three subject");
}
else
{
System.out.println("The student fail");
}}
}
