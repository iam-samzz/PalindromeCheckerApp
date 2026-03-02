import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void reverse_and_check(String word){
        boolean status = true;

        char arr[] = word.toCharArray();
        //reverse
        int end_pointer = word.length()-1;
        for(int i=0; i< word.length()-1; i++)
        {
            if(i>end_pointer)
                break;
            else
            {
                if(arr[i] == arr[end_pointer])
                {
                    end_pointer--;
                }
                else
                {
                    status = false;
                }
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
