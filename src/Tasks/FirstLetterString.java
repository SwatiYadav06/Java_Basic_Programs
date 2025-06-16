package Tasks;

import java.util.Scanner;

public class FirstLetterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter The string");
        String words = scanner.nextLine();
        String lot = words.trim().replaceAll("\\s+", " ");
        String[] real = lot.split(" ");
        // System.out.println(real);
       /* for(String name : real){
            if(!name.isEmpty()){
                System.out.print(name.charAt(0));
            }
        }*/
        for (int i = 0; i < real.length; i++) {
            String word = real[i];
            System.out.println(word.charAt(i));
        }

    }
}
