/*Write a program to compute the factorial of the number 10.*/


class factorial
{
public static void main(String args[])
{
int num=10;
int factorial=1;
for(int i=1;i<=10;i++)
{
factorial*=i;
}
System.out.println("The factorial of " + num +" is "+factorial);
}
} 