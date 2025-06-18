package Tasks.BeginnerLevelPrograms.ForLoop;

public class NaturalNumbersSum {
    public static void main(String[] args) {
        System.out.println("Print first 10 Natural Numbers : ");

        for (int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
        }
        System.out.println("");
        int sum=0;
        for (int i=1;i<=10;i++)
        {
             sum+=i;
        }
        System.out.println("Sum of Numbers : "+sum);
    }
}
