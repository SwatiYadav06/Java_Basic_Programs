package Tasks;

import java.util.Scanner;

public class CountWords_UsingReplaceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Remove leading/trailing spaces and replace multiple spaces with a single space
        input = input.trim().replaceAll("\\s+", " ");

        // If input is empty after trimming, word count is 0
        if (input.isEmpty()) {
            System.out.println("Word Count: 0");
        } else {
            // Split the string by space and count words
            String[] words = input.split(" ");
            System.out.println("Word Count: " + words.length);
        }

        sc.close();
    }
}
