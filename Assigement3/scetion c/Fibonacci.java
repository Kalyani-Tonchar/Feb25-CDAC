//5. Write a program to print the Fibonacci sequence up to the number 21.

class Fibonacci
{
public static void main(String args[])
{
int a=0,b=1,c;
System.out.print("The fibonacci series upto 21 is :" + a +" "+b);
while(true)
{
c=a+b;
if(c>21)
break;
System.out.print(" "+c);
a=b;
b=c;
}
}
}



