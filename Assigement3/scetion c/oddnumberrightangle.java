/* 21. Write a program to print the following pattern: 
1 
1*3 
1*3*5 
1*3*5*7 
1*3*5*7*9   
*/

class oddnumberrightangle
{
 public static void main(String args[])
  { 
    for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=5-i;j++)
           {

             System.out.print("j");
}
for(int k=1;k<=(2*i-1);k++)
{
if(k<j)
System.out.print("*");
}
System.out.println("");
}
}
}

