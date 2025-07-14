import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 15: ");
        int num = sc.nextInt();

        if(num<0 || num>15){
            System.out.println("Please enter between 0 and 15 ");
        }
        else{
            String hex = Integer.toHexString(num).toUpperCase();
            System.out.println("The hexadecimal value is: " +hex);
        }
    }
    
}
