package P00FinalExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        Map<String, String> heroMap = new HashMap<>();

        while (!inputLine.equals("End")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            String name = tokens[1];

            switch (command){
                case "Enroll":
                    if (heroMap.containsKey(name)){
                        System.out.printf("%s is already enrolled.%n", name);
                    }else {
                        heroMap.put(name,"");
                    }
                    break;
                case "Learn":
                    String spell = tokens[2];
                    if (!heroMap.containsKey(name)){
                        System.out.printf("%s doesn't exist.%n", name);
                    }else if (heroMap.containsValue(spell)){
                        System.out.printf("%s has already learnt %s.%n",name,spell);
                    }else {
                        heroMap.put(name,spell);
                    }
                    break;
                case "Unlearn":
                    String spells = tokens[2];
                    if (!heroMap.containsKey(name)){
                        System.out.printf("%s doesn't exist.%n", name);
                    }else if (!heroMap.containsValue(spells)){
                        System.out.printf("%s doesn't know %s.%n", name,spells);
                    }else {
                        heroMap.put(name,"");
                    }
                    break;
            }
            inputLine=scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : heroMap.entrySet()) {
            System.out.printf("Heroes:%n== %s:%s",entry.getKey() ,entry.getValue());
        }

    }
}
