package P03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int[] numArr = Arrays
                                .stream(scanner.nextLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();

        for (int i = 0; i <=numArr.length-1; i++) {
            boolean isBigger = true;
            for (int j = i+1; j <=numArr.length-1 ; j++) {
                if (numArr[i]<=numArr[j]){
                    isBigger=false;
                }
            }
            if (isBigger){
                System.out.print(numArr[i]+" ");
            }

        }
    }
}
