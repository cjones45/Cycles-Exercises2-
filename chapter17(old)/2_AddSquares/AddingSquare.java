import java.util.Scanner;

public class AddingSquare{
    public static void main(String[] args) {
        double inLimit;
        double count = 1;
        double totalsquare = 0;
      
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the limit");
        inLimit = scan.nextInt();
        
        while(count <= inLimit){

            double squareadd= Math.pow(count,2);
            totalsquare = totalsquare + squareadd;

            System.out.println(squareadd);
            count++;

            
        } System.out.println(totalsquare);

        




        




    }
}