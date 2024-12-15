package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberOfSnow=Integer.parseInt(scanner.nextLine());

         double maxValue=Double.MIN_VALUE;
         int snowballSnowBiggest=0;
         int snowballSnomTime=0;
         int allQUialuty=0;

        for(int i=1;i<=nNumberOfSnow ;i++){
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());

            double snowballValue=Math.pow(snowballSnow / snowballTime,snowballQuality) ;

            if(snowballValue > maxValue){
                maxValue=snowballValue;
                snowballSnowBiggest=snowballSnow;
                snowballSnomTime=snowballTime;
                allQUialuty=snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snowballSnowBiggest,snowballSnomTime,maxValue,allQUialuty);

    }
}
