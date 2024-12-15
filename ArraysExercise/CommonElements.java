package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[]arrayFirst=scanner.nextLine().split(" ");
        String[]arraySecond=scanner.nextLine().split(" ");

        for (String inputSecond:arraySecond) {
            for (String inputFirst:arrayFirst) {
                if(inputSecond.equals(inputFirst)){
                    System.out.print(inputSecond + " ");
                }
            }
        }
    }
}
