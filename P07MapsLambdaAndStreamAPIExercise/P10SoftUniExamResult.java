package P07MapsLambdaAndStreamAPIExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P10SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> userPoints = new TreeMap<>();
        Map<String, Integer> languageCount = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] splitArray = input.split("-");
            String username = splitArray[0];
            if (splitArray.length == 3) {
                String language = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);

                if (!userPoints.containsKey(username)) {
                    userPoints.put(username, points);
                } else {
                    int currentPoints = userPoints.get(username);
                    if (points > currentPoints) {
                        userPoints.put(username, points);
                    }
                }

                if (!languageCount.containsKey(language)) {
                    languageCount.put(language, 1);
                } else {
                    languageCount.put(language, languageCount.get(language) + 1);
                }

            } else {
                userPoints.remove(username);
            }
            input = scanner.nextLine();
        }

        System.out.println("Results:");
        userPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
