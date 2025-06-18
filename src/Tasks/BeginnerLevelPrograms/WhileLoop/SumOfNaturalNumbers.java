package Tasks.BeginnerLevelPrograms.WhileLoop;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Print first 10 Natural numbers : ");
        int i = 1,j=0;
        int sum=0;
        while (j <= 10)
        {
            System.out.print(j+" ");
            j++;
        }
        System.out.println(" ");
        while (i <= 10)
        {
            sum+=i;
            i++;
        }
        System.out.println("Sum of first 10 Natural numbers :  "+sum);
    }

}
