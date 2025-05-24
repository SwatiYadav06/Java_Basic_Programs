package Tasks;

import java.util.Scanner;

public class DaysInMonths {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter month number:");
        int month=scanner.nextInt();

        System.out.println("Enter year:");
        int year=scanner.nextInt();

        int days = 0;

        switch(month)
        {
            case 1 -> days=31;
            case 2 ->
            {
                if((year%4==0 && year%100!=0) || (year%400==0))
                {
                    days=29;
                }
                else{days=28;}
            }

            case 3->days=31;
            case 4->days=30;

            case 5->days=31;

            case 6->days=30;

            case 7->days=31;

            case 8->days=31;

            case 9->days=30;

            case 10->days=31;

            case 11->days=30;

            case 12->days=31;
            default->
                    System.out.println("Invalid input");

        }
        System.out.println("Number of days: " + days);

    }

}
