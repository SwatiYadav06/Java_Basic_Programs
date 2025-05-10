package Ex_01_Java_Basics;

import java.util.Scanner;

public class Maths_Tables {
    public static void main(String[] args) {
        int n,i,result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a value for table=");
        n=scanner.nextInt();
        for(i=1;i<=10;i++)
        {
            result=n*i;
            System.out.println(n+"X"+i+"="+result);
        }

    }
}
