package P07MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().replaceAll("\\s+","");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol:text.toCharArray()) {
            if (!symbolsCount.containsKey(symbol)){
                symbolsCount.put(symbol, 1);
            }else{
                int currentCount=symbolsCount.get(symbol);
                symbolsCount.put(symbol,currentCount+1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> "+ entry.getValue()));
    }
}
