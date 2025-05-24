package Tasks;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for factorial:");
        int num = scanner.nextInt();

        long fact = 1;
        for (int i = 1; i <= num; i++) {
            if (num < 0) {
                System.out.println("Please enter valid number for factorial");
            } else {
                fact = fact * i;
            }

        }
        System.out.println("Factorial=" + fact);

    }
}
