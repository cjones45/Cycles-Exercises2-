import java.util.Scanner;
public class firstloops
{
    
  public static void main (String[] args ) {
    Scanner scan = new Scanner(System.in);
    double inStart; 
    double inEnd;  
    double total;

    System.out.println("enter the start number:");
    inStart = scan.nextInt();
    System.out.println("enter the end number:");
    inEnd = scan.nextInt();
        
    while (inStart <= inEnd)   
    {
      
      System.out.println(inStart);
      inStart = (inStart + 1);
  
      
      
         
    }
  }
}
