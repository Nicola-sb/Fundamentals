package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //1 2 3 4 5 5 5 6
        //Delete 5
        //Insert 10 1
        String command=scanner.nextLine();
        while (!command.equals("end")){
            String firsLine=command.split(" ")[0];
            int secondNumber=Integer.parseInt(command.split(" ")[1]);
            if(firsLine.equals("Delete")){
                numbersInput.removeAll(Arrays.asList(secondNumber));
            }else if(firsLine.equals("Insert")){
                int thirdPositionElement=Integer.parseInt(command.split(" ")[2]);
                numbersInput.add(thirdPositionElement,secondNumber);
            }
            command=scanner.nextLine();
        }
        for (int number:numbersInput){
            System.out.print(number+ " ");
        }

    }
}
