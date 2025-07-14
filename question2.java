import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter an ASCII code: ");
        int code = sc.nextInt();

        if(code<0 || code>127){
            System.out.println("Error Enter a code between 0 and 127");
        }
        else{
            char character = (char)code;
            System.out.println("The unicode for " +code+ " is "  +character);
        }

        System.out.println("Enter a unicode: ");
        char ch = sc.next().charAt(0);

        int unicode = (int)ch;
        System.out.println("The ASCII for " +ch+ " is " +unicode);






    }
    
}
