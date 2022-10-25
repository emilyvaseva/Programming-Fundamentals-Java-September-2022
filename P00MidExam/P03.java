package P00MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> myList = Arrays
                .stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] inputArr = input.split(" \\| ");


            if (inputArr[0].equals("Add Book")) {
                String book = inputArr[1];
                if (!myList.contains(book)) {
                    myList.add(0, book);
                }
            } else if (inputArr[0].equals("Take Book")) {
                String book = inputArr[1];
                myList.remove(book);
            } else if (inputArr[0].equals("Swap Books")) {
                String book1 = inputArr[1];
                String book2 = inputArr[2];

                if (myList.contains(book1) && myList.contains(book2)) {
                    int index1 = myList.indexOf(book1);
                    int index2 = myList.indexOf(book2);
                    myList.set(index1, book2);
                    myList.set(index2, book1);
                }
            } else if (inputArr[0].equals("Insert Book")) {
                String book = inputArr[1];

                if (!myList.contains(book)) {
                    myList.add(book);
                }
            } else if (inputArr[0].equals("Check Book")) {
                int index = Integer.parseInt(inputArr[1]);


                if (index >= 0 && index <= myList.size() - 1) {
                    String element = myList.get(index);
                    System.out.println(element);

                }
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", myList));

    }
}