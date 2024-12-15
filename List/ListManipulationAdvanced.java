package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());//2 13 43 876 342 23 543

        String input=scanner.nextLine();
        while (!input.equals("end")){
          List<String>command=Arrays.stream(input.split(" ")).collect(Collectors.toList());
          String firstCommand=command.get(0);
          String secondCommand=command.get(1);
          String thirdCommand=command.get(2);

          switch (firstCommand){
              case "Contains":
                  int number=Integer.parseInt(command.get(1));
                  for(int i=0 ;i<numbersInput.size() ;i++){
                     int currentEl=Integer.parseInt(String.valueOf(numbersInput.get(i)));
                      if(currentEl==number){
                          System.out.println("Yes");
                      }else{

                      }
                  }
                  break;
              case "Print":
                  if(secondCommand.equals("even")) {
                      for (int i = 0; i < numbersInput.size(); i++) {
                          List<Integer> evenNumber = new ArrayList<>();
                          int currentEl = Integer.parseInt(String.valueOf(numbersInput.get(i)));
                          if (currentEl % 2 == 0) {
                              evenNumber.add(currentEl);
                          }
                          for (int element : evenNumber) {
                              System.out.print(element + " ");
                          }
                      }
                      System.out.println();
                  }
                  if(secondCommand.equals("odd")) {
                      for (int i = 0; i < numbersInput.size(); i++) {
                          List<Integer> oddNumber = new ArrayList<>();
                          int currentEl = Integer.parseInt(String.valueOf(numbersInput.get(i)));
                          if (currentEl % 2 == 1) {
                              oddNumber.add(currentEl);
                          }
                          for (int element : oddNumber) {
                              System.out.print(element + " ");
                          }
                      }
                  }
                  break;
              case "Get":
                  if(secondCommand.equals("sum")){
                      int allSum=0;
                      for(int i=0 ;i<numbersInput.size() ;i++){
                          int currentEl=Integer.parseInt(String.valueOf(numbersInput.get(i)));
                          allSum=allSum+currentEl;
                      }
                      System.out.print(allSum);
                  }
                  break;
              case "Filter":
                  List<Integer>printUnder100=new ArrayList<>();
//                  for(int i=0 ;i<numbersInput.size() ;i++){
//                      int currentEl=Integer.parseInt(String.valueOf(numbersInput.get(i)));
//                      if(currentEl >= thirdCommand){
//                          printUnder100.add(currentEl);
//                      }
//                      for (int element:printUnder100){
//                          System.out.print(element + " ");
//                      }
//                  }
//                  break;
          }


            input=scanner.nextLine();
        }
    }
}
