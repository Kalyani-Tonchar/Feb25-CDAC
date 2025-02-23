/*. Swap Two Numbers
Write a Java program to swap the values of two variables without using a third variable*/

class swap
{
public static void main(String args[])
{
int a = 10, b = 20;
a = a + b;
b = a - b;
a = a - b; 
System.out.println("First a is 10 after swapping a is = " + a);
System.out.println("First b is 20 after swapping b is = " + b);
}
}