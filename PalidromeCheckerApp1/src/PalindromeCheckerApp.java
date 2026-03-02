import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;

        char arr[] = word.toCharArray();
        //reverse

        Stack<Character> s = new Stack<Character>();

        for(int i = 0;i<word.length();i++)
        {
            s.push(arr[i]);
        }

        char rev[] = new char[word.length()];
        for(int i = 0;i<word.length(); i++)
        {
            rev[i] = s.pop();
        }

        //now 2 array is there, one is arr[] and another is rev[]

        for(int i = 0; i<word.length();i++)
        {
            if(arr[i] == rev[i])
            {
                status = true;

            }
            else{
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
        reverse_and_check(name);
    }
}