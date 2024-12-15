package MidExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer>numbersList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        //"[52 74 23 44 96 110]"

        String command=scanner.nextLine();//Shoot 5 10
        while (!command.equals("End")){
            String[] commandString=command.split(" ");//Shoot 5 10
            String firstCommand=commandString[0];//Shoot
            int index=Integer.parseInt(commandString[1]);//5
            int value=Integer.parseInt(commandString[2]);//10
            switch (firstCommand){
                case "Shoot":
                  if(isValidIndex(numbersList,index)){
                      int currentPower=numbersList.get(index);
                      currentPower=currentPower-value;
                      if(currentPower<=0){
                          numbersList.remove(index);
                      }else {
                          numbersList.set(index,currentPower);
                      }
                  }
                    break;
                case "Add":
                    if(isValidIndex(numbersList,index)){
                        numbersList.add(index,value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean valudRaidus=numbersList.size()-1 >=index &&
                            numbersList.size()-1 >=index+value &&
                            index - value >=0;
                    if(valudRaidus){
                        int radius=value * 2 +1;
                        for(int i=0 ;i<radius ;i++){
                            numbersList.remove(index-value);
                        }
                    }else{
                        System.out.println("Strike missed!");
                    }

                    break;
            }

            command=scanner.nextLine();
        }

        List<String>resultList=new ArrayList<>();
        for(int target:numbersList){
            resultList.add(String.valueOf(target));
        }
        System.out.println(String.join("|",resultList));

    }
    public static boolean isValidIndex(List<Integer>listBoolean,int index){
        return index >=0 && index <=listBoolean.size()-1;
    }
}
