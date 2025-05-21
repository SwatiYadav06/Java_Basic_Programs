package Tasks;

public class Task_02 {
    public static void main(String[] args) {


            // result = condition1? expression1 : (condition2 ? expression2 : expression3);
            // Use the ternary operator, nested ternary operator.
            // If we have three numbers, N1, N2, and N3,
            // give me the maximum between the three numbers.



            int n1 = 2;
            int n2 = 9;
            int n3 = 11;

            // logic building formula we will use
            // step 1 find the input and out for data types
            // inputs --> n1,n2,n3 --> int
            // outputs ---> int - max numbers

            // step 2 rough logic, think about it
            // n1 > n2 && n2 > n3 --> n1
            // n2 > n3 && n2 > n1 --> n2

            // step 3 Run program

            int max = (n1 > n2)? (n2 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
            System.out.println(max);

    }
}
