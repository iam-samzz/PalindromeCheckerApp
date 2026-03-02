import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;

        char arr[] = word.toCharArray();
        //reverse

        Stack<Character> s = new Stack<Character>();
        Queue<Character> q = new LinkedList<>();
        for(int i = 0;i<word.length();i++)
        {
            s.push(arr[i]);
            q.offer(arr[i]);

        }
        //stack  created...and queue also created


        //lets check the dequeue and pop
        int index =0;
        while(index<word.length())
        {
            if(s.pop() == q.poll())
            {
                index++;
            }
            else
            {
                status = false;
                break;
            }
        }

        //printing the status
        System.out.println("Is it a Palindrome?"+status);
    }


    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("Input text: ");
        String name = s1.next();

        //function call
        reverse_and_check(name);
    }
}