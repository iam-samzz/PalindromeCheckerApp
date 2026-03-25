import java.util.*;

// Main Class
public class PalindromeCheckerApp {

    // Strategy Interface
    interface PalindromeStrategy {
        boolean isPalindrome(String input);
    }

    // Stack आधारित Strategy
    static class StackStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String input) {

            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            Stack<Character> stack = new Stack<>();

            // Push all characters
            for (char c : normalized.toCharArray()) {
                stack.push(c);
            }

            // Compare while popping
            for (char c : normalized.toCharArray()) {
                if (c != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // Deque आधारित Strategy
    static class DequeStrategy implements PalindromeStrategy {
        public boolean isPalindrome(String input) {

            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            Deque<Character> deque = new ArrayDeque<>();

            for (char c : normalized.toCharArray()) {
                deque.add(c);
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack");
        System.out.println("2. Deque");
        int choice = scanner.nextInt();

        // Strategy selection (Polymorphism)
        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}