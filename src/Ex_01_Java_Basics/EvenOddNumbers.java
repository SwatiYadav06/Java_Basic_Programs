package Ex_01_Java_Basics;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("It is Even number");
            }
        else {
                System.out.println("It is a Odd Number");
        }
    }
}
