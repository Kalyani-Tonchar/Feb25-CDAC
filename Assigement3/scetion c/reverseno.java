/*Write a program to reverse the digits of the number 1234. The output should be 4321.*/


class reverseno
{
public static void main(String args[])
{
int num=1234;
int reversed=0;
while(num!=0){
int digit=num%10;
reversed = reversed * 10 + digit;
num /= 10; // Remove last digit
}
System.out.println("Reversed number: " + reversed);
 
}
}

