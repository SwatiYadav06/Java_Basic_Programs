package Tasks.BeginnerLevelPrograms.ForLoop;

public class MultiplicationFiveTable {
    public static void main(String[] args) {
        System.out.println("Table of 5 : ");

        for (int i=1;i<=10;i++)
        {
            int mul=5*i;
            System.out.printf("%d x %d = %d%n",5,i,mul);
        }
    }
}
