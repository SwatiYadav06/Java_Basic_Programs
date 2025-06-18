package Tasks.Array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of all numbers: " + sum);

        scanner.close();
    }
}
