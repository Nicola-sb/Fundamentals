package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> travelString= Arrays.stream(scanner.nextLine().split("||")).collect(Collectors.toList());
        int startingAmountFuel=Integer.parseInt(scanner.nextLine());
        int startingAmountAmunnition=Integer.parseInt(scanner.nextLine());

        String command=travelString.get(1);

        if(command.equals("Travel")){

        }else if(command.equals("Enemy")){

        }else if(command.equals("Repair")){

        }

    }
}
