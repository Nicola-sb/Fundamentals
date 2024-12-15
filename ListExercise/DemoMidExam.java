package ListExercise;

import java.util.Scanner;

public class DemoMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOFAdventure=Integer.parseInt(scanner.nextLine());//10
        int countPlayers=Integer.parseInt(scanner.nextLine());//7
        double groupEnergy=Double.parseDouble(scanner.nextLine());//5035.5


            while (groupEnergy >=0){
                double waterPerDayForOnePerson=Double.parseDouble(scanner.nextLine());//11.3
                double foodPerDayForOnePerson=Double.parseDouble(scanner.nextLine());//7.2
                double totalWater= daysOFAdventure * countPlayers * waterPerDayForOnePerson;//791
                double totalFood=daysOFAdventure *countPlayers * foodPerDayForOnePerson;////504

                for(int i=1 ;i<=daysOFAdventure ;i++){
                    int currentDay=i;
                    if(currentDay % 2==0){
                        groupEnergy=groupEnergy * 1.05;
                        waterPerDayForOnePerson=waterPerDayForOnePerson*0.70;
                    }
                    if(currentDay % 3 ==0){
                        totalFood=foodPerDayForOnePerson/countPlayers;
                        groupEnergy=groupEnergy * 1.10;
                    }


                }



            }





    }
}
