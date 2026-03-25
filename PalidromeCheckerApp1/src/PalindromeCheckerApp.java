import java.util.Scanner;

/**
 * MAIN CLASS - PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution performance
 * of palindrome validation algorithms. [cite: 16]
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input gathering [cite: 31]
        System.out.print("Input: ");
        String input = scanner.nextLine();

        // 1. Capture execution start time [cite: 7, 19]
        long startTime = System.nanoTime();

        // 2. Run the algorithm logic [cite: 6]
        boolean isPalindrome = checkPalindrome(input);

        // 3. Capture execution end time [cite: 19]
        long endTime = System.nanoTime();

        // 4. Calculate total execution duration [cite: 20]
        long duration = endTime - startTime;

        // 5. Display benchmarking results [cite: 8, 21, 32, 33]
        System.out.println("Is Palindrome? " + isPalindrome);
        System.out.println("Execution Time: " + duration + " ns");

        scanner.close();
    }

    /**
     * Core logic to validate if a string is a palindrome.
     * Strengthening core programming fundamentals and data structures. [cite: 2]
     */
    private static boolean checkPalindrome(String str) {
        if (str == null) return false;

        String cleanStr = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}