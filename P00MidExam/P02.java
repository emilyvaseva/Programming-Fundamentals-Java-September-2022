package P00MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myCoffeeList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .collect(Collectors.toList());


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] commandArr = scanner.nextLine().split(" ");
            String command = commandArr[0];
            switch (command) {
                case "Include":
                    String coffeeAdd = commandArr[1];
                    myCoffeeList.add(coffeeAdd);
                    break;

                case "Remove":
                    String index = commandArr[1];
                    int countOfCoffee = Integer.parseInt(commandArr[2]);
                    if(myCoffeeList.size() < countOfCoffee){
                        continue;
                    }

                    if (index.equals("first")) {
                        for (int j = 1; j <= countOfCoffee; j++) {
                            String itemRemove = myCoffeeList.get(0);
                            myCoffeeList.remove(itemRemove);
                        }

                    } else if (index.equals("last")) {
                        for (int k = 1; k <= countOfCoffee; k++) {
                            myCoffeeList.remove(myCoffeeList.size()-1);
                        }
                    }
                    break;
                case "Prefer":
                    int firstCoffeeIndex = Integer.parseInt(commandArr[1]);
                    int secondCoffeeIndex = Integer.parseInt(commandArr[2]);
                    if (isInRange(myCoffeeList, firstCoffeeIndex) && isInRange(myCoffeeList, secondCoffeeIndex)) {
                        String element1 = myCoffeeList.get(firstCoffeeIndex);
                        String element2 = myCoffeeList.get(secondCoffeeIndex);


                        myCoffeeList.set(firstCoffeeIndex,element2);
                        myCoffeeList.set(secondCoffeeIndex,element1);
                    }else{
                        continue;
                    }

                    break;
                case "Reverse":
                    Collections.reverse(myCoffeeList);
                    break;
            }



        }
        System.out.println("Coffees:");
        System.out.println(String.join(" ", myCoffeeList));
    }

    public static boolean isInRange(List<String> elements, int index) {
        return index >= 0 && index <= elements.size()-1;
    }
}
