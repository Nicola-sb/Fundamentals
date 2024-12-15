package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int totalShots=0;
        String command=scanner.nextLine();
        while (!command.equals("End")){
            int currentNumber= Integer.parseInt(scanner.nextLine());



            command=scanner.nextLine();
        }
        System.out.printf("Shot targets: %d",totalShots);
        printArray(numbers);
    }

    private static void printArray(int[] array) {
        for(int i=0 ;i< array.length ;i++){
            int currentElement=array[i];
            System.out.println(currentElement + " ");
        }
    }

}
