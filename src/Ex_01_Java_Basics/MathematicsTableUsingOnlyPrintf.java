package Ex_01_Java_Basics;

import java.util.Scanner;

public class MathematicsTableUsingOnlyPrintf {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a value for table=");
        number=scanner.nextInt();

        System.out.printf("%d x 1 = %d%n", number, number * 1);
        System.out.printf("%d x 2 = %d%n", number, number * 2);
        System.out.printf("%d x 3 = %d%n", number, number * 3);
        System.out.printf("%d x 4 = %d%n", number, number * 4);
        System.out.printf("%d x 5 = %d%n", number, number * 5);
        System.out.printf("%d x 6 = %d%n", number, number * 6);
        System.out.printf("%d x 7 = %d%n", number, number * 7);
        System.out.printf("%d x 8 = %d%n", number, number * 8);
        System.out.printf("%d x 9 = %d%n", number, number * 9);
        System.out.printf("%d x 10 = %d%n", number, number * 10);
    }
}
