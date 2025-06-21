package CodingTest12_06_2025;

public class IncrementDemo {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Value of i: " + i);

        int pre = ++i;
        System.out.println("Value of pre after increament (++i): " + pre);

        int k = 5;
        int post = k++;
        System.out.println("Value of post after increament (k++): " + post); // 5
        System.out.println("Value of k after post-increment: " +k);        // 6
    }
}
