package Tasks.Array;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " number:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest number: " + max);

        scanner.close();
    }
}
