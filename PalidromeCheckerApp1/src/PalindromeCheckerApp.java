import java.util.Scanner;

public class PalindromeCheckerApp{

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Step 1: Normalize string
        // Remove spaces & convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome
        boolean result = isPalindrome(normalized, 0, normalized.length() - 1);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}