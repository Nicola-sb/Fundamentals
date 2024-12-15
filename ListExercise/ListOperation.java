package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //1 23 29 18 43 21 20
        String command=scanner.nextLine();
        while (!command.equals("End")){
           if(command.contains("Add")){
               int addNumber=Integer.parseInt(command.split(" ")[1]);
               numbersInput.add(addNumber);
           }else if(command.contains("Insert")){
               int numberToInsert=Integer.parseInt(command.split(" ")[1]);
               int indexToIsert=Integer.parseInt(command.split(" ")[2]);
               if(isIndexValid(indexToIsert,numbersInput.size())){
                   numbersInput.add(indexToIsert,numberToInsert);
               }else{
                   System.out.println("Invalid index");
               }
           }else if(command.contains("Remove")){
               int indexToRemove=Integer.parseInt(command.split(" ")[1]);
               if(isIndexValid(indexToRemove,numbersInput.size())){
                  numbersInput.remove(indexToRemove);
               }else{
                   System.out.println("Invalid index");
               }
           }else if(command.contains("Shift left")){
               int countLeft=Integer.parseInt(command.split(" ")[2]);//3
               for(int i=1 ;i<=countLeft ;i++){
                   int firstElement=numbersInput.get(0);
                   numbersInput.add(firstElement);
                   numbersInput.remove(0);//firstElement da probwam posle
               }
           }else if(command.contains("Shift right")){
               int countRight=Integer.parseInt(command.split(" ")[2]);
               for(int i=1 ;i<=countRight ;i++){
                   int lastNumber=numbersInput.get(numbersInput.size()-1);
                   numbersInput.add(0,lastNumber);
                   numbersInput.remove(numbersInput.size()-1);
               }
           }
            command=scanner.nextLine();
        }
        for (int numberElement:numbersInput){
            System.out.print(numberElement+ " ");
        }

    }
    public static boolean isIndexValid(int index,int number){
        return index>=0 && index<=number-1;
    }
}
