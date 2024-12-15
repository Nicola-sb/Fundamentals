package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYuiled=Integer.parseInt(scanner.nextLine());

        int totalSpice=0;
        int countDays=0;
        while (startingYuiled >= 100){
            int spices=startingYuiled-26;
            totalSpice=totalSpice+spices;
            countDays++;
            startingYuiled=startingYuiled-10;
        }
        System.out.println(countDays);
        if(totalSpice>=26){
            totalSpice=totalSpice-26;

        }
        System.out.println(totalSpice);

    }
}
