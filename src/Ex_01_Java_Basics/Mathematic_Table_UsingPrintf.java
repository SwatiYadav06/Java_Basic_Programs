package Ex_01_Java_Basics;

import java.util.Scanner;

public class Mathematic_Table_UsingPrintf {

    public static void main(String[] args) {
        int n,i,result;
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter a value for table=");
        n=scanner.nextInt();
        for(i=1;i<=10;i++)
        {
            result=n*i;
            System.out.printf("%d x %d = %d%n", n, i, result);
        }
    }

}
