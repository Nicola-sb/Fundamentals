package List;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String command=scanner.nextLine();
        while (!command.equals("End")){

            if(command.contains("Add")){
                int numberToAdd=Integer.parseInt(command.split(" ")[1]);
                numbersInput.add(numberToAdd);
            }else if(command.contains("Insert")){
                int numberToInsert=Integer.parseInt(command.split(" ")[1]);
                int indexToInsert=Integer.parseInt(command.split(" ")[2]);
                if(isIndexValid(indexToInsert,numbersInput.size())){
                    numbersInput.add(indexToInsert,numberToInsert);
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
                int countLeft=Integer.parseInt(command.split(" ")[2]);
                for(int i=1 ;i<=countLeft ;i++){
                    int firstNumber=numbersInput.get(0);
                    numbersInput.add(firstNumber);
                    numbersInput.remove(0);
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
            System.out.print(numberElement + " ");
        }


 }

 public static boolean isIndexValid(int number,int index){
        return number >=0 && number<=index-1;
 }
}

