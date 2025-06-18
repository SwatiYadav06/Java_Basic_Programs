package Tasks.BeginnerLevelPrograms.WhileLoop;

public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.print("Print even number 1 to 20 : ");
        int i=1;
        while (i<=20)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
