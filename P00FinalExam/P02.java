package P00FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String inputLine = scanner.nextLine();
            Pattern pattern = Pattern.compile("(\\|)(?<bossName>[A-Z]+)\\1\\:(\\#)(?<specialty>[A-Za-z]+\\s[A-Za-z]+)\\3");
            Matcher matcher = pattern.matcher(inputLine);
            if(matcher.find()){

                String bossName = matcher.group("bossName");
                String specialty = matcher.group("specialty");
                System.out.printf("%s, The %s%n",bossName,specialty);
                System.out.printf(">> Strength: %d%n",bossName.length());
                System.out.printf(">> Armor: %d%n",specialty.length());

            }else{
                System.out.println("Access denied!");
            }
        }
    }
}