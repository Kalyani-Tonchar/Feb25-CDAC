/*14. Print the Fibonacci Series
Write a Java program to print the Fibonacci series up to the 10th number.
Expected Output:
0 1 1 2 3 5 8 13 21 34

*/

class Fibonacci
{
public static void main(String args[])
{
int a=0,b=1,num;
System.out.print(a+" "+b);
for(int i=1;i<=8;i++){
num=a+b;
System.out.print(" "+num+" ");
a=b;
b=num;
}
}
}



