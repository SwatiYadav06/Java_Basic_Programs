package Tasks;

import java.util.Scanner;

public class RecursiveStringReverse {
    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base case: empty string or single character
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Recurse on the substring from index 1 to end, then append the first character
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverse(input);
        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
