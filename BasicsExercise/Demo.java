package BasicsExercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames=Integer.parseInt(scanner.nextLine());
        double headsetPrise=Double.parseDouble(scanner.nextLine());
        double mousePrise=Double.parseDouble(scanner.nextLine());
        double keybordPrise=Double.parseDouble(scanner.nextLine());
        double displayPrise=Double.parseDouble(scanner.nextLine());

        int headsetCount=lostGames / 2;
        double headeset=headsetCount * headsetPrise;

        int mouseCount=lostGames / 3;
        double mouse=mouseCount * mousePrise;

        int keybordCount=lostGames /  6;
        double keybord=keybordCount * keybordPrise;

        int displayCount=lostGames / 12;
        double display=displayCount * displayPrise;

        double allPrise=headeset + mouse + keybord + display;

        System.out.printf("Rage expenses: %.2f lv.",allPrise);


    }
}