package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power=Integer.parseInt(scanner.nextLine());
        int distance=Integer.parseInt(scanner.nextLine());
        int exhaustionFactor=Integer.parseInt(scanner.nextLine());

        int countTarger=0;
        int firstPower=power;

        while (power >= distance){
             power=power-distance;
            countTarger++;


            if(power==firstPower * 0.50){
                if(exhaustionFactor>0){
                    power=power / exhaustionFactor;
                }
            }
        }


        System.out.println(power);
        System.out.println(countTarger);




    }
}
