import java.util.Scanner;

public class Jetlag{
    public static void main(String[] args) {
        double inHours;
        double inZones;
        double inDepart;
        double inArrive;
        double recovDays;
    
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the hours");
        inHours = scan.nextInt();
        System.out.println("Enter the Zones");
        inZones = scan.nextInt();
        System.out.println("Enter the Departure");
        inDepart = scan.nextInt();
        System.out.println("Enter the Arrive");
        inArrive = scan.nextInt();

        recovDays = ((inHours / 2) + (inZones - 3) + (inDepart + inArrive) / 10);

        System.out.println(recovDays);




        




    }
}