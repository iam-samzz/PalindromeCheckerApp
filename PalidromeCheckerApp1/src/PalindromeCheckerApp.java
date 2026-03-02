import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;

        char arr[] = word.toCharArray();
        //reverse

        Deque<Character> deque = new ArrayDeque<>();
        for(int i = 0;i<word.length();i++)
        {
            deque.offer(arr[i]);

        }
        //stack  created...and queue also created


        //lets check the dequeue and pop
        int index =0;
        while(index<word.length()/2)
        {
            if(deque.pollFirst() == deque.pollLast())
            {
                index++;
            }
            else
            {
                status =false;
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