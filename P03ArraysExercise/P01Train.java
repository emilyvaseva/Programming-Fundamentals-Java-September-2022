package P03ArraysExercise;


import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons=Integer.parseInt(scanner.nextLine());
                int[] numArr = new int[countOfWagons];
                int sum=0;
        for (int i = 0; i <countOfWagons ; i++) {
            numArr[i]=Integer.parseInt(scanner.nextLine());

            System.out.print(numArr[i] + " ");
            sum+=numArr[i];

        }
        System.out.printf("%n%d",sum);
    }
}
