package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TrainVagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCountVagons=Integer.parseInt(scanner.nextLine());
        int[]wagons=new int[nCountVagons];

        for(int i=0 ;i<nCountVagons ;i++){
            int countPeople=Integer.parseInt(scanner.nextLine());
            wagons[i]=countPeople;
        }
        int sum=0;

        for (int index1:wagons) {
            System.out.print(index1 + " ");
            sum=sum+index1;
        }
        System.out.println();
//        System.out.println(sum);
        System.out.println(Arrays.stream(wagons).sum());

//        for(int index=0 ;index<wagons.length ;index++){
//            System.out.print(wagons[index] + " ");
//            sum=sum+wagons[index];
//        }
//        System.out.println();
//        System.out.println(sum);

//        int n=Integer.parseInt(scanner.nextLine());
//
//        int[]numbers=new int[n];
//        int sum=0;
//        for(int i=0 ;i<numbers.length ;i++){
//            int currentNumber=Integer.parseInt(scanner.nextLine());
//            System.out.print(currentNumber + " ");
//            sum=sum+currentNumber;
//        }
//        System.out.println();
//        System.out.println(sum);


    }
}
