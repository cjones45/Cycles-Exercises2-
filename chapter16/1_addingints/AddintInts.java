import java.util.Scanner;
public class AddintInts
{
    
  public static void main (String[] args ) {
    Scanner scan = new Scanner(System.in);
    double inIntegerCount; 
    double answer = 0;
    double hello;

    System.out.println("enter the number of integers:");
    inIntegerCount = scan.nextInt();
        
    while (inIntegerCount > 0)   
    {
      
      System.out.println("Enter a value:");
      inIntegerCount--;
      hello = scan.nextInt();
      answer = answer + hello;

      
  
      
      
         
    }
    System.out.println("the answer is: " + answer);
  }
}