public class snnipt10 { 
 public void display() { 
 System.out.println("No parameters"); 
 } 
 public void display(int num) { 
 System.out.println("With parameter: " + num); 
 } 
 public static void main(String[] args) { 
snnipt10 obj=new snnipt10();
 obj.display(); 
 obj.display(5); 
 } 
}