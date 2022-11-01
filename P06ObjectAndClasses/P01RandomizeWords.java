package P06ObjectAndClasses;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");
        Random rndGenerator = new Random();

        for (int i = 0; i < words.length; i++) {
            int indexX = rndGenerator.nextInt(words.length);
            int indexY = rndGenerator.nextInt(words.length);

            String oldWordX=words[indexX];
            words[indexX]=words[indexY];
            words[indexY]=oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
