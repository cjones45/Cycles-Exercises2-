import java.util.Scanner;
public class Exercise2
{
    
  public static void main (String[] args ) {
    Scanner scan = new Scanner(System.in);
    double inN; 
    double answer = 0;
    double change;

    System.out.println("enter the divisor:");
    inN = scan.nextInt();
        
    while (inN > 0)   
    {
      
      
      change = (1 / inN);
      inN--;
      answer = answer + change;

      
  
      
      
         
    }
    System.out.println("the answer is: " + answer);
  }
}