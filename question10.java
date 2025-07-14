public class question10 {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word.charAt(3));

        System.out.println(word.substring(5));
        
        for (int i=0;i<+5;i++){
            System.out.println(word.charAt(i));
            if(word.charAt(i)==3){
                break;
            }
        }
        
        System.out.println(word.substring(0, word.length()-2));
      
        for (int i=0;i<word.length();i+=2){
            System.out.println(word.charAt(i));
        }

        for(int i=1;i<=word.length();i+=2){
            System.out.println(word.charAt(i));
        }
        
        String r = "";
        char ch;
        for(int i=0;i<word.length();i++){
            ch =  word.charAt(i);
            r = ch + r;
        }
        System.out.println("The reverse string is:" +r);

        for (int i= word.length()-1; i>=0;i-=2){
            System.out.println(word.charAt(i));
        }
        
        System.out.println(word.length());
    }
}
