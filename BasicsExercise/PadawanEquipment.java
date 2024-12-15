package BasicsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //точки 60 от 100;

        double amountOfMoney=Double.parseDouble(scanner.nextLine());
        int countStudents=Integer.parseInt(scanner.nextLine());
        double priseLightsabers=Double.parseDouble(scanner.nextLine());
        double priseRobes=Double.parseDouble(scanner.nextLine());
        double priseBelt=Double.parseDouble(scanner.nextLine());

        double countLightsaberes=Math.ceil(countStudents * 1.10);
        double sumLightsaberes=countLightsaberes * priseLightsabers;

        double countRobes=countStudents;
        double sumRobes=countRobes * priseRobes;

        double countFreeBelts=(countStudents * 1.0 / 6);
        double freeBelts=Math.round(countStudents-countFreeBelts);

        double sumFreeBelts=freeBelts * priseBelt;

        double allSum=sumLightsaberes + sumRobes + sumFreeBelts;

        if(allSum<=amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",Math.abs(allSum));
        }else{
            System.out.printf("George Lucas  will need %.2flv more.",allSum-amountOfMoney);
        }




    }
}
