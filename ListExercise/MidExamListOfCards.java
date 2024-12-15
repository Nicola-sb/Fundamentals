package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MidExamListOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Ace Aof Diamonds, Queen of Hearts, King of Clubs
//3
//Add, King of Diamonds
//Insert, 2, Jack of Spades
//Remove, Ace of Diamonds

        List<String>listOfCards= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        int n=Integer.parseInt(scanner.nextLine());

        for(int i=1 ;i<+n ;i++){
          String command=scanner.nextLine();
            if(command.contains("Add")){
                listOfCards.add(command);
            }




        }

    }
}
