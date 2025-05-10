package Ex_01_Java_Basics;

public class Fibbonacci_Series {
    public static void main(String[] args) {
        {
            int next,a=0,b=1;
           System.out.println(a);
            for(int i=0;i<=10;i++)
            {
                next=a+b;
                System.out.print(next + " ");
                a=b;
                b=next;
            }
        }

    }
}
