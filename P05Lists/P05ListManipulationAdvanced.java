package P05Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String lineInput = scanner.nextLine();
        while (!lineInput.equals("end")) {
            String[] commandArr = lineInput.split(" ");

            switch (commandArr[0]) {
                case "Contains":
                    int containsNum = Integer.parseInt(commandArr[1]);
                    if (numbersList.contains(containsNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandArr[1].equals("even")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 == 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    } else if (commandArr[1].equals("odd")) {
                        for (int i = 0; i < numbersList.size(); i++) {
                            if (numbersList.get(i) % 2 != 0) {
                                System.out.print(numbersList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;

                    for (Integer number : numbersList) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String outputFilter = "";
                    int num = Integer.parseInt(commandArr[2]);

                    if (commandArr[1].equals("<")) {
                        for (Integer numList : numbersList) {
                            if (numList < num) {
                                outputFilter += String.valueOf(numList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals(">")) {
                        for (Integer numList : numbersList) {
                            if (numList > num) {
                                outputFilter += String.valueOf(numList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals(">=")) {
                        for (Integer numList : numbersList) {
                            if (numList >= num) {
                                outputFilter += String.valueOf(numList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    } else if (commandArr[1].equals("<=")) {
                        for (Integer numList : numbersList) {
                            if (numList <= num) {
                                outputFilter += String.valueOf(numList) + " ";
                            }
                        }
                        System.out.println(outputFilter);
                    }
                    break;
            }
            lineInput = scanner.nextLine();
        }
    }
}
