package Tasks.BeginnerLevelPrograms.ForLoop;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 20");

        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
