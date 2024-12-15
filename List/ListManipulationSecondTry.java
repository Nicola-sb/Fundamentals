package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //2 13 43 876 342 23 543
        String input=scanner.nextLine();
        while (!input.equals("end")){
            List<String>commandInput=Arrays.stream(input.split(" ")).collect(Collectors.toList());
            //Contains 100
            String firstCommand=commandInput.get(0);
            String secondCommand=commandInput.get(1);
            switch (firstCommand){
                case "Contains":
                    int numberAfterContais=Integer.parseInt(commandInput.get(1));
                    for(int i=0 ;i<numbersInput.size() ;i++){
                        int currentElement=numbersInput.get(i);
                        if(currentElement==numberAfterContais){
                            System.out.println("Yes");
                        }
                        if(numbersInput.get(i)!=currentElement){
                            System.out.println("No such number");
                        }
                    }
                    break;
                case "Print":
                    if(secondCommand.equals("even")){
                        for(int i=0 ;i<numbersInput.size() ;i++){
                            List<Integer>evenNumber=new ArrayList<>();
                            int currentElement=numbersInput.get(i);
                            if(currentElement % 2 ==0){
                                evenNumber.add(currentElement);
                            }
                            for (int element:evenNumber){
                                if(element!=evenNumber.size()-1){
                                    System.out.print(element + " ");
                                }else{
                                    System.out.print(element);
                                }
                            }
                        }
                        System.out.println();
                    }else if(secondCommand.equals("odd")){
                            for(int i=0 ;i<numbersInput.size() ;i++){
                                List<Integer>oddNumber=new ArrayList<>();
                                int currentElement=numbersInput.get(i);
                                if(currentElement % 2 ==1){
                                    oddNumber.add(currentElement);
                                }
                                for (int element:oddNumber){
                                    if(element!=oddNumber.size()-1){
                                        System.out.print(element + " ");
                                    }else{
                                        System.out.print(element);
                                    }
                                }
                            }
                    }
                    break;
                case "Get":
                    if(secondCommand.equals("sum")){
                        int sum=0;
                        for(int i=0 ;i<numbersInput.size() ;i++){
                            int currentElement=numbersInput.get(i);
                            sum=sum+currentElement;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    if(secondCommand.equals(">=")){
                        int thirdcommand=Integer.parseInt(commandInput.get(2));
                        for(int i=0 ;i<numbersInput.size() ;i++){
                            List<Integer>biggerThnaThirdCommand=new ArrayList<>();
                            int currentElement=numbersInput.get(i);
                            if(currentElement >=thirdcommand){
                                biggerThnaThirdCommand.add(currentElement);
                            }
                            for (int element:biggerThnaThirdCommand){
                                if(element!=biggerThnaThirdCommand.size()-1){
                                    System.out.print(element + " ");
                                }else{
                                    System.out.println(element);
                                }
                            }
                        }
                        System.out.println();
                    }else if(secondCommand.equals("<")){
                        int thirdCommand=Integer.parseInt(commandInput.get(2));
                        for(int i=0 ;i<numbersInput.size() ;i++){
                            List<Integer>numberUnderThirdCommand=new ArrayList<>();
                            int currentElement=numbersInput.get(i);
                            if(currentElement < thirdCommand){
                                numberUnderThirdCommand.add(currentElement);
                            }
                            for (int element:numberUnderThirdCommand){
                                if(element!=numberUnderThirdCommand.size()-1){
                                    System.out.print(element + " ");
                                }else{
                                    System.out.println(element);
                                }
                            }
                        }

                    }
                    break;
            }

            input=scanner.nextLine();
        }
    }
}
