import java.util.Scanner;
public class Exercise3
{
    
  public static void main (String[] args ) {
    Scanner scan = new Scanner(System.in);
    int total; 
    String inWord1;  
    String inWord2;
    int lengthword1;
    int lengthword2;

    System.out.println("enter the first word:");
    inWord1 = scan.nextLine();
    lengthword1 = inWord1.length();

    System.out.println("enter the first word:");
    inWord2 = scan.nextLine();
    lengthword2 = inWord2.length();

    total = (30 - lengthword1 - lengthword2);

    System.out.print(inWord1);

    while ( total > 0)   {

      System.out.print(".");
      total--;
  
      
      
         
    }
    System.out.print(inWord2);
  }
}
