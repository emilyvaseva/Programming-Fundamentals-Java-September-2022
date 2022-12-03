package P10ExamPreparation;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String activationKey = scanner.nextLine();
        String inputLine= scanner.nextLine();

        while (!inputLine.equals("Generate")){
            String[] tokens = inputLine.split(">>>");
            String command = tokens[0];

            String substringToken="";
            int startIndex=0;
            int endIndex=0;

            switch (command){
                case "Contains":
                    substringToken = tokens[1];

                    if (activationKey.contains(substringToken)){
                        System.out.printf("%s contains %s%n",activationKey,substringToken);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower=tokens[1];
                    startIndex=Integer.parseInt(tokens[2]);
                    endIndex=Integer.parseInt(tokens[3]);
                    substringToken=activationKey.substring(startIndex,endIndex);

                    if (upperOrLower.equals("Upper")){
                        activationKey=activationKey.replace(substringToken, substringToken.toUpperCase());
                    }else {
                        activationKey=activationKey.replace(substringToken,substringToken.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex=Integer.parseInt(tokens[1]);
                    endIndex=Integer.parseInt(tokens[2]);

                    substringToken = activationKey.substring(startIndex, endIndex);
                    activationKey = activationKey.replace(substringToken, "");

                    System.out.println(activationKey);
                    break;

            }


            inputLine= scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n",activationKey);
    }
}
