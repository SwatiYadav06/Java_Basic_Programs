package Tasks;

import java.util.Scanner;

public class Reverse_UsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = "";

        // Loop through the string from the end to the beginning
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}
