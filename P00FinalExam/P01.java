package P00FinalExam;

import java.util.Locale;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String theString = scanner.nextLine();

        String command = scanner.nextLine();

        while (!command.equals("Done")){

            if (command.contains("Change")){
                String charToChange = command.split("\\s+")[1];
                String replace = command.split("\\s+")[2];

                theString = theString.replaceAll(charToChange, replace);
                System.out.println(theString);

            }else if (command.contains("Includes")){
                String check = command.split("\\s+")[1];

                if (theString.contains(check)){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }else if (command.contains("End")){
                String substringAtEnd = command.split("\\s+")[1];
                if (theString.endsWith(substringAtEnd)){
                    System.out.println("True");
                }else {
                    System.out.println("False");
                }
            }else if (command.contains("Uppercase")){
                theString = theString.toUpperCase();
                System.out.println(theString);
            }else if (command.contains("FindIndex")){
                String indexToCheck = command.split("\\s+")[1];
                System.out.println(theString.indexOf(indexToCheck));
            }else if (command.contains("Cut")){
                int start = Integer.parseInt(command.split(" ")[1]);
                int end = Integer.parseInt(command.split(" ")[2]);
                String remove = theString.substring(start,start+end);
                theString.replaceFirst(remove,"");
                System.out.println(remove);
            }


            command = scanner.nextLine();
        }
    }
}