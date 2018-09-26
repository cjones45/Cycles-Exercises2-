import java.util.Scanner;

public class Stars{
    public static void main(String[] args) {
        double inRows;
        
        String star = "*";
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the rows");
        inRows = scan.nextInt();
        double count = inRows;
        while (inRows >= count){
            while(inRows >= count){
                System.out.print(star);
                count--;
            }
            count--;
            
        }
        
        




        




    }
}