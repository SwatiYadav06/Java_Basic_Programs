package Tasks;

import java.util.Scanner;

public class Reverse_usingStringBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Using StringBuffer's built-in reverse method
        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}
