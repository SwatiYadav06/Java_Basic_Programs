package Ex_01_Java_Basics;

public class FizzBuzz_program {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++)
        {
            if(i%3==0){
                System.out.print("Fizz ");
            }
            else if(i%5==0)
            {
                System.out.print("Buzz ");
            }
            else
                System.out.print(i+" ");
        }

    }
}
