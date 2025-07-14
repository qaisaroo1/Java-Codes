import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        String r = "";
        char ch;
        for(int i=0;i<sentence.length(); i++){
            ch = sentence.charAt(i);
            r = ch + r; 

        }
        if (r.equals(sentence)){
            System.out.println("The string is pallindrome");
        }
        else{
            System.out.println("The string is not pallindrome");
        }
    }
    
}
