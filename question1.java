import java.util.Scanner;
public class question1{
    public static void main(String args[]){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter point1 (Longitude and lattitude): ");
            double x1  = sc.nextDouble();
            double y1 = sc.nextDouble();
        
            System.out.println("Enter point2 (Longitude and lattitude): ");
            double x2 = sc.nextDouble();
            double y2=  sc.nextDouble();

            double radius = 6371.01;
            x1 = Math.toRadians(x1);
            y1 = Math.toRadians(y1);
            x2 = Math.toRadians(x2);
            y2 = Math.toRadians(y2);

            double cosfunction = Math.sin(x1) * Math.sin(x2) * Math.cos(x1) * Math.cos(x2) * Math.cos(y1 -y2);
            double distance = radius * Math.acos(cosfunction);
            
            System.out.println("The distance between teo point is: " +distance);
        
        
    }
}