package P04MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());

        printSmallestNumber(num1,num2,num3);

    }

    public static void printSmallestNumber(int number1, int number2, int number3){
        if (number1<=number2 && number1<=number3){
            System.out.println(number1);
        }else if(number2<=number1 && number2<=number3){
            System.out.println(number2);
        }else if(number3<=number1 && number3<=number2){
            System.out.println(number3);
        }

    }
}
