package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nNumberLines=Integer.parseInt(scanner.nextLine());
        int sum=0;

        for(int i=1;i<=nNumberLines ;i++){
            int quantityOfWoter=Integer.parseInt(scanner.nextLine());
            sum=sum+quantityOfWoter;

            while (quantityOfWoter<255){
                System.out.println("Insufficient capacity!");


                quantityOfWoter=Integer.parseInt(scanner.nextLine());
            }
        }


    }
}
