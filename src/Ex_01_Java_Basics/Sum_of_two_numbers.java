package Ex_01_Java_Basics;

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 1st number=");
        int a=scanner.nextInt();

        System.out.println("Enter 2nd number=");
        int b=scanner.nextInt();

        int sum=a+b;
        System.out.println("Sum of numbers="+sum);
    }

}
