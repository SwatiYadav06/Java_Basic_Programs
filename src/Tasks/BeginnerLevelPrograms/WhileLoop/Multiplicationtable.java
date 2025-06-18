package Tasks.BeginnerLevelPrograms.WhileLoop;

public class Multiplicationtable {
    public static void main(String[] args) {
        System.out.println("Print table of 7 :");
        int i=1;
        int mul=0;
        while (i<=10)
        {
            mul=7*i;
            System.out.printf("%d X %d = %d%n",7,i,mul);
            i++;
        }
    }
}
