package EX_06_Ternary_Operators;

public class Task_03 {
    public static void main(String[] args) {
        // result = condition1? expression1 : (condition2 ? expression2 : expression3);

        // Again, use the nested ternary.
        // You have to figure it out if I am an adult, minor, or senior.
        // What is the condition? The condition is very simple.
        // If my age is greater than 18, then I can be minor or adult or senior.
        // But if my age is greater than 65, then I am a senior.
        // If I am between 18 to 65, then I am an adult.


        int age = 69;
        String result = (age > 69) ? "senior" : (age < 18) ? "minior" : "adult";
        System.out.println(result);
    }
}
