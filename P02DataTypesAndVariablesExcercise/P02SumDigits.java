package P02DataTypesAndVariablesExcercise;

import java.util.Scanner;

public class P02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int number = Integer.parseInt(scanner.nextLine());
        while (number>0){
            int lastDigit = number%10;
            sum+=lastDigit;
            number=number/10;

        }
        System.out.println(sum);
    }
}
