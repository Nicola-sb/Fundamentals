package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines=Integer.parseInt(scanner.nextLine());

        double maxVolume=Double.MIN_VALUE;
        String maxKeg="";

        for(int i=1;i<=nLines ;i++){
            String model=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());

            double volume=Math.PI * Math.pow(radius,2) * height;

            if(volume > maxVolume){
                maxVolume=volume;
                maxKeg=model;
            }
        }
        System.out.println(maxKeg);

    }
}
