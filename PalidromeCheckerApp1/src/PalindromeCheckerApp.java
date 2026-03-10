import java.util.Scanner;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;

        LinkedList<Character> list = new LinkedList<>();

        int len = word.length();

        for(int i=0; i<len ; i++)
        {
            list.add(word.charAt(i));
        }
        //now word is added in the linked list

        //now lets reverse the 2nd half
        char temp;

        //hel(2.5)lo , len = 5, len/2 = 2.5,  moom, len/2 = 2, i>len, i>2,
        {
            int j = len / 2; //2
            //System.out.println("J:"+j);
            for (int i = len - 1; i > len / 2; i--)
            {
                temp = list.get(i);
                list.set(i, word.charAt(j));
                list.set(j, temp);

                j++ ;


            }
        }

        //after reversing in the linked list , we are compating the values.
        int j = len/2; //2
        for(int i=0; i<len/2 ; i++)
        {
            if(list.get(i) == list.get(j))
            {
                j++;
            }
            else
            {
                status = false;
                break;
            }

        }
        //printing the status
        //System.out.println("List:"+list);
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