package Tasks;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase and remove non-alphanumeric characters (optional)
        String cleanInput = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Reverse the string manually
        String reversed = "";
        for (int i = cleanInput.length() - 1; i >= 0; i--) {
            reversed += cleanInput.charAt(i);
        }

        // Check if original equals reversed
        if (cleanInput.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
