package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TrainSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>listOfWagons= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityOfWagon=Integer.parseInt(scanner.nextLine());

        String command=scanner.nextLine();
        while (!command.equals("end")){
            String firstCommand=command.split(" ")[0];
            int secondEle=Integer.parseInt(command.split(" ")[0]);
            if(firstCommand.equals("Add")){
                int secondElement=Integer.parseInt(command.split(" ")[1]);
                listOfWagons.add(secondElement);
            }



            command=scanner.nextLine();
        }
    }
}
