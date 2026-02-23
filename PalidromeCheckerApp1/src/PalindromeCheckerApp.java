import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void check(String word){
        boolean status = true;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                status = false;
                break;
            }
        }


            System.out.println("Is it a Palindrome?"+status);

    }

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Input text: ");
        String name = s1.next();
        check(name);

    }
}