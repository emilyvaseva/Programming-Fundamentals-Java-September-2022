package P00MidExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());
        int countOfBattles = Integer.parseInt(scanner.nextLine());
        double currentExperience=0;
        boolean isEnough=false;
        int countBattle=0;
        for (int battle = 1; battle <= countOfBattles ; battle++) {
            countBattle++;
            double experienceEarnedPerBattle = Double.parseDouble(scanner.nextLine());
            currentExperience+=experienceEarnedPerBattle;
            if (battle%3==0){
                currentExperience+=(experienceEarnedPerBattle*0.15);
            }
            if (battle%5==0){
                currentExperience-=(experienceEarnedPerBattle*0.1);
            }
            if(battle%15==0){
                currentExperience+=(experienceEarnedPerBattle*0.05);
            }
            if (currentExperience>=neededExperience){
                isEnough=true;
                break;

            }
        }

        if (isEnough){
            System.out.printf("Player successfully collected his needed experience for %d battles.",countBattle);
        }else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience-currentExperience);
        }
    }
}
