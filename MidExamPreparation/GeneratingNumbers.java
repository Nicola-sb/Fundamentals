package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GeneratingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputNumber= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command=scanner.nextLine();
        //
        while (!command.equals("END")){

            if(command.contains("add to start")){////add to start 1 2 3
             int firstIndex=Integer.parseInt(command.split(" ")[3]);
             int secondIndex=Integer.parseInt(command.split(" ")[4]);
             int thirdIndex=Integer.parseInt(command.split(" ")[5]);
//             inputNumber.get(0);
             inputNumber.set(0,firstIndex);
             inputNumber.set(1,secondIndex);
             inputNumber.set(2,thirdIndex);

            }else if(command.contains("replace")){//replace 10 1
                int currentValue=Integer.parseInt(command.split(" ")[1]);
                int currentReplacment=Integer.parseInt(command.split(" ")[2]);
                   for(int i=0 ;i<inputNumber.size() ;i++){
                       int currentElement=inputNumber.get(i);
                       if(currentElement==currentValue){
                           inputNumber.set(currentElement,currentReplacment);
                       }
                   }
            }else if(command.contains("remove at index")) {
                int element = Integer.parseInt(command.split(" ")[3]);
                if (isIndexValid(element, inputNumber.size())) {
                    inputNumber.remove(element);
                }
            }else if(command.contains("find even")){
                for (int i = 0; i <inputNumber.size(); i++) {
                    List<Integer> evenNumber = new ArrayList<>();
                    int currentEl = Integer.parseInt(String.valueOf(inputNumber.get(i)));
                    if (currentEl % 2 == 0) {
                        evenNumber.add(currentEl);
                    }
                    for (int element : evenNumber) {
                        System.out.print(element + " ");
                    }
                }

            }else if(command.contains("find odd")){
                for (int i = 0; i < inputNumber.size(); i++) {
                    List<Integer> oddNumber = new ArrayList<>();
                    int currentEl = Integer.parseInt(String.valueOf(inputNumber.get(i)));
                    if (currentEl % 2 == 1) {
                        oddNumber.add(currentEl);
                    }
                    for (int element : oddNumber) {
                        System.out.print(element + " ");
                    }
                }

            }

            command=scanner.nextLine();
        }
        System.out.println();


        for (int element:inputNumber){
            if(element==inputNumber.size()-1){
                System.out.print(element);
            }else{
                System.out.print(element + ", ");
            }
        }
    }

    public static boolean isIndexValid(int index,int number){
        return index>=0 && index<=number-1;
    }

}




//            }else if(command.contains("remove greater than")){
//                int element=Integer.parseInt(command.split(" ")[3]);
//                if(isIndexValid(element,inputNumber.size())){
//                for(int i=0 ;i<inputNumber.size() ;i++) {
//                    int currentElement = inputNumber.get(i);
//                    if (currentElement > element) {
//                        inputNumber.remove(currentElement);
//                    }
//                }
//                }
