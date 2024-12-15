package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.*;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Не е решена

        List<Integer>listOfWagons= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity= parseInt(scanner.nextLine());
      //32 54 21 12 4 0 23
        String command=scanner.nextLine();
        while (!command.equals("end")){

            if(command.contains("Add")){
                int passenger=Integer.parseInt(command.split(" ")[1]);
                listOfWagons.add(passenger);
            }else{
                int passenger=Integer.parseInt(command.split(" ")[0]);
                for(int i=0 ;i<listOfWagons.size() ;i++){
                    if(listOfWagons.get(i)+passenger<=maxCapacity){
                        listOfWagons.set(i,listOfWagons.get(i)+passenger);
                        break;
                    }
                }

            }
            command=scanner.nextLine();
        }
        for (int elementWagons:listOfWagons){
            System.out.print(elementWagons + " ");
        }
    }
}
