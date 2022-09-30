package P03Arrays;

import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputArr = inputLine.split(" ");
        int[] numsArr = new int[inputArr.length];

        for (int i = 0; i < numsArr.length; i++) {
            numsArr[i]=Integer.parseInt(inputArr[i]);

        }
        int evenSum=0;
        for (int i = 0; i < numsArr.length; i++) {
            int currentElement = numsArr[i];
            if (currentElement%2 == 0){
                evenSum+=currentElement;
            }


        }
        System.out.println(evenSum);
    }
}
