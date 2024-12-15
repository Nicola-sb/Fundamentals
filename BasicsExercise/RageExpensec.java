package BasicsExercise;

import java.util.Scanner;

public class RageExpensec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrise=Double.parseDouble(scanner.nextLine());
        double mousePrise=Double.parseDouble(scanner.nextLine());
        double keybordPrise=Double.parseDouble(scanner.nextLine());
        double displayPrise=Double.parseDouble(scanner.nextLine());

        int countHeadset=lostGames / 2;
        double sumHeadset=countHeadset * headsetPrise;

        int countMouse=lostGames / 3;
        double sumMouse=countMouse * mousePrise;

        int countKeybord=lostGames / 6;
        double sumKeybord=countKeybord * keybordPrise;

        int countDisplay=lostGames / 12;
        double sumDisplay=countDisplay * displayPrise;

        double expenses= sumHeadset + sumMouse + sumDisplay + sumKeybord;

        System.out.printf("Rage expenses: %.2f lv.",expenses);
    }
}
