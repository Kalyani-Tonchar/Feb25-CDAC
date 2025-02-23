/*public class LoopVariableScope { 
public static void main(String[] args);
{
int x=0; 
 for (int i = 0; i < 5; i++) { 
 int x = i * 2; 
 } 
 System.out.println(x);
 } 
} */

public class LoopVariableScopeFixed { 
    public static void main(String[] args) { 
        int x = 0; // Declare x outside the loop
        for (int i = 0; i < 5; i++) { 
            x = i * 2; // Assign a new value inside the loop
        } 
        System.out.println(x); // Now x is accessible here
    } 
}



