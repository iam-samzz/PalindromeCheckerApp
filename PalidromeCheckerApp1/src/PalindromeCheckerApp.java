import java.util.Scanner;

public class PalindromeCheckerApp {

    // Encapsulated method (Palindrome Service)
    public boolean checkPalindrome(String input) {

        // Normalize string (ignore spaces & case)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Convert to char array
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Check palindrome
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create object of same class
        PalindromeCheckerApp app = new PalindromeCheckerApp();

        boolean result = app.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}